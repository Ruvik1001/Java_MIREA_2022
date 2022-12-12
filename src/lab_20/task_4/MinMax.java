package lab_20.task_4;

public class MinMax <T extends Comparable<T>> {
    private T[] arr;

    public MinMax(T[] arr){
        this.arr= arr;
    }

    public T getMin(){
        if(arr.length > 0){
            T min = this.arr[0];
            for (T i : this.arr)
                if(i.compareTo(min) < 0)
                    min = i;
            return min;
        }
        return null;
    }

    public T getMax(){
        if(arr.length > 0){
            T max = this.arr[0];
            for (T i : this.arr)
                if(i.compareTo(max) > 0)
                    max = i;
            return max;
        }
        return null;
    }
    public String printMinMax() {
        return "Max: " + this.getMax() + ", Min: " + this.getMin();
    }

    public static void main(String[] args) {
        MinMax<Integer> inter = new MinMax<>(new Integer[]{1,4,3,6,4,8});
        System.out.println(inter.printMinMax());
    }

}
