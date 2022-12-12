package lab_24.task_2;


public class task_2 {
    public interface AbstractChairFactory{
        VictorianChair createVictorianChair();
        MagicChair createMagicChair();
        FunctionalChair createFunctionalChair();
    }
    public static abstract class Chair{
    }
    public static class VictorianChair extends Chair{
        private int age;

        public VictorianChair(int age){
            this.age = age;
        }
        public int getAge() {
            return age;
        }

    }

    public static class MagicChair extends Chair{
        void doMagic(){
            System.out.println("Magic!!");
        }
    }
    public static class FunctionalChair extends Chair{
        public int sum(int a, int b){
            return a + b;
        }
    }
    public static class ChairFactory implements AbstractChairFactory{

        @Override
        public VictorianChair createVictorianChair() {
            return new VictorianChair(20);
        }

        @Override
        public MagicChair createMagicChair() {
            return new MagicChair();
        }

        @Override
        public FunctionalChair createFunctionalChair() {
            return new FunctionalChair();
        }

    }
    public static class Client{
        Chair chair;
        public void sit(){
            System.out.println("Sitting on " + chair.getClass().getSimpleName());
        }

        public void setChair(Chair chair) {
            this.chair = chair;
        }
    }

    public static void main(String[] args) {
        Chair chair_1 = new ChairFactory().createVictorianChair();
        Chair chair_2 = new ChairFactory().createMagicChair();
        Chair chair_3 = new ChairFactory().createFunctionalChair();
        Client client = new Client();
        client.setChair(chair_1);
        client.sit();
        client.setChair(chair_2);
        client.sit();
        client.setChair(chair_3);
        client.sit();
    }
}
