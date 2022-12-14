package lab_13.task_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class task_6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = "Котов Нью-Йорк Аслам Воркута Метрополитен";
        System.out.println("String: " + fileName);
        String [] arr = fileName.split(" ");
        getLine(0,arr);
    }

    public static void getLine(int q,String... words) {
        if(q == words.length) return;
        StringBuilder result= new StringBuilder();
        List<String> list = new ArrayList<>(Arrays.asList(words));
        result.append(list.get(q)+" ");
        String word = list.get(q);
        list.remove(q);
        int max=list.size();
        int count=0;

        while (true) {
            for (int i=0;i<list.size();i++) {
                if ( list.get(i).toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
                    result.append(list.get(i)+" ");
                    word=list.get(i);
                    list.remove(i);
                    break;
                }
            }
            count++;
            if (list.size()==0 || max == count) break;
        }

        for (String text : list)
            result.append(text+" ");
        System.out.println(result.toString());
        getLine(++q,words);
    }
}

