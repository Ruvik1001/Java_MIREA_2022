package lab_21.task_2_3;

public class AnyTypeArray<E> {
    private E [] arr;

    public AnyTypeArray(E[] arr){
        this.arr = arr;
    }

    public E getArrIndex(int i){
        return  arr[i] ;
    }

    public void setArr( E [] arr){
        this.arr =  arr;
    }

    public int getLength(){
        return  arr.length ;
    }

    public static void main(String[] args) {
        AnyTypeArray<String> str = new AnyTypeArray<>(new String[]{"Hello", "World","!"});
        System.out.println(str.getArrIndex(1));
        AnyTypeArray<Integer> inter = new AnyTypeArray<>(new Integer[]{ 1,2,3,4,5,6,7,8});
        System.out.println(inter.getArrIndex(1));
        AnyTypeArray<Double> doubl = new AnyTypeArray<>(new Double[]{1.2,1.5,6.7});
        System.out.println(doubl.getArrIndex(1));
    }
}
