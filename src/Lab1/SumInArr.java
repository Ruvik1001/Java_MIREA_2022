package Lab1;

public class SumInArr {
    int n;
    int[] arr;

    public SumInArr(int[] arr, int n) {
        this.n = n;
        this.arr = new int[n];
        for (int i = 0; i < n; i++) this.arr[i] = arr[i];
    }

    public int sumFOR() {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += arr[i];
        return sum;
    }

    public int sumWHILE() {
        int sum = 0;
        int i = 0;
        while (n > 0 && i < n) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public int sumDOWHILE() {
        int sum = 0;
        int i = 0;
        if (n < 1) return 0;
        do {
            sum += arr[i];
            i++;
        } while (i < n);
        return sum;
    }
}
