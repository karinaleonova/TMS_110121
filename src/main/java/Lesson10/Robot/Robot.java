package Lesson10.Robot;


public class Robot implements IRobot{
    private String name;
    private IHead head;
    private IHand hand;
    private ILeg leg;

        public Robot(String name , IHead head, IHand hand, ILeg leg) {
            this.head = head;
            this.hand = hand;
            this.leg = leg;
            this.name = name;
        }

        public Robot(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

        public IHead getHead() {
            return head;
        }

        public void setHead(IHead head) {
            this.head = head;
        }

        public IHand getHand() {
            return hand;
        }

        public void setHand(IHand hand) {
            this.hand = hand;
        }

        public ILeg getLeg() {
            return leg;
        }

        public void setLeg(ILeg leg) {
            this.leg = leg;
        }

        @Override
        public void action() {
            System.out.println(name + " robot is activated - ");
            head.speak();
            hand.upHand();
            leg.step();
        }

        /**
         * Get the cost of a robot
         * @return int
         */
        @Override
        public int getPrice() {
            int price = head.getPrice() + hand.getPrice() + leg.getPrice();
            return price;
        }

        public static void expensiveRobot(Robot r, Robot t,Robot b){

            if(r.getPrice() > t.getPrice() && r.getPrice() > b.getPrice()){
                System.out.println(r.name + " - The most expensive");
            }
            if(t.getPrice() > r.getPrice()&& t.getPrice() > b.getPrice()){
                System.out.println(t.name + " - The most expensive");
            }
            if(b.getPrice() > t.getPrice() && b.getPrice() > r.getPrice()){
                System.out.println(b.name + " - The most expensive");
            }

        }



    }


