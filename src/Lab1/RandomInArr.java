package Lab1;

import java.util.random.*;
import java.util.Arrays;

public class RandomInArr {
    private int[] arr;
    private int n;

    public RandomInArr(int[] arr, int n) {
        this.n = n;
        this.arr = arr;
    }

    public void withRandom() {
        for (int i = 0; i < n; i++)
            arr[i] = RandomGenerator.getDefault().nextInt(0, 100);
    }

    public void withMath() {
        for (int i = 0; i < n; i++)
            arr[i] = (int)(Math.random() * 100 - 1);
    }

    public void sort() {
        Arrays.sort(arr);
    }
}
