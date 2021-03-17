package homeworks;// 3)Вычислить: 1+2+4+8+...+256

public class HW_Task3_Ls5 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        System.out.println(count + 1);
    }

}
