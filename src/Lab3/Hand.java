package Lab3;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Hand {
    public void welcome() {
        System.out.print("*Waving his hand*\n");
    }

    public void shakeHands() {
        System.out.print("*Shook hands*\n");
    }

    public void hit() {
        String hit[] = new String[]{"*Hook*", "*Uppercut*", "*Straight punch*"};
        System.out.print(hit[RandomGenerator.getDefault().nextInt(3)] + "\n");
    }
}
