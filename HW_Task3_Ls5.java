// 3)Вычислить: 1+2+4+8+...+256

public class HW_Task3_Ls5 {
    public static void main(String[] args) {
        int[] num = new int[256];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;

            if (num[i] % 2 == 0) {

                count += num[i];

            }

        }
        System.out.println(count + 1);
    }

}
