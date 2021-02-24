package Lesson10.Robot;

public class Run {
    public static void main(String[] args) {
//        /*
//        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
//        Класс SonyHead является примером реализацией головы от Sony.
//        Создайте 3 робота с разными комплектующими.
//        Например у робота голова и нога от Sony а, рука от Samsung.
//        У всех роботов вызовите метод action.
//        Среди 3-х роботов найдите самого дорогого.
//        *
        SamsungHead samHead = new SamsungHead(1000);
        SamsungHand samHand = new SamsungHand(550);
        SamsungLeg samLeg = new SamsungLeg(700);

        SonyHead sonyHead = new SonyHead(980);
        SonyHand sonyHand = new SonyHand(510);
        SonyLeg sonyLeg = new SonyLeg(600);

        ToshibaHead tosHead = new ToshibaHead(930);
        ToshibaHand tosHand = new ToshibaHand(330);
        ToshibaLeg tosLeg = new ToshibaLeg(470);

        Robot rob = new Robot("Rob",tosHead,samHand,samLeg);
        Robot toby = new Robot("Toby",samHead,tosHand,sonyLeg);
        Robot rony = new Robot("Rony",sonyHead,sonyHand,tosLeg);

        rob.action();
        toby.action();
        rony.action();


        Robot.expensiveRobot(rob,toby,rony);




    }
}
