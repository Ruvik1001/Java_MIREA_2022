package Lab5.Gifka;

public class Main {
    public static MainWindow window;
    public static void main(String[] args) throws InterruptedException {
        window = new MainWindow();
        while (true)
            window.update(30);
    }
}
