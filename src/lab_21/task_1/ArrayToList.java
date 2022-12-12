package lab_21.task_1;

import java.util.LinkedList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String [] str = {"1","2","3","4","5","6","7","8","9","10"};

        List<String> list = new LinkedList();

        for(int i=0;i< str.length; i++){
            list.add(str[i]);
            System.out.println(list.get(i));
        }
    }
}
