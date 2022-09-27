package Lab5.Match;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Матч: Милан и Мадрид", "Милан", "Мадрид");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        frame.setSize(310, 100);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}