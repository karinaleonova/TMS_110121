public class Lesson2 {
        public static void main(String[] args) {
            int s = 4500;
            int sec = s % 60;
            int m = (s - sec) / 60;

            int min = m % 60;
            int h = (m - min) / 60;
            
            int hour = h % 60;
            int d = (h - hour)/24;

            int days = d % 7;
            int w = (d - days)/7;

            System.out.println(sec);


            System.out.println("a: " + min + " min " + sec + " sec");
            System.out.println("b: " + h + " hours " + min + " min " + sec + " sec");
            System.out.println("c:" + d + " days " + h + " hours " + min + " min " + sec + " sec");
            System.out.println("d:" + w + " week " + d + " days " + h + " hours " + min + " min " + sec + " sec");

        }
}