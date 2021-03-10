package lesson8.task21;

//Напишите три цикла выполняющих многократное сложение строк, один с
//        помощью оператора сложения и String, другой с помощью StringBuilder и метода
//        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

public class Task21 {
    public static void main(String[] args) {
        String one = "One";
        String two = "Two";
        String three = "Three";

//     1 :
        for(int i = 0; i < 5;i++){
            one += one;
        }

//     2 :
        StringBuffer strBuffer = new StringBuffer(two);
        for(int i = 0; i < 5;i++) {
            strBuffer.append(strBuffer);

        }
//      3 :
        StringBuilder strBuilder = new StringBuilder(three);
        for(int i = 0; i < 5;i++) {
            strBuilder.append(strBuilder);

        }

        try {
            int i = test(strBuffer) -test(strBuilder);
            System.out.println("Difference between : " + i + "ms");
        } catch (java.io.IOException e ) {
            System.err.println(e.getMessage());
        }
    }
    private static int test(Appendable obj) throws java.io.IOException {
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < 10000000; ) {
            obj.append("");
        }

        long after = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
                return (int) (after - before);
    }
}
