package lab_27.task_1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashsetToTreeset {
    public static <T> Set<T> getInstance(Set<T> hashSet) {
        return new TreeSet<>(hashSet);
    }
    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("CAR");
        hashSet.add("HOUSE");
        hashSet.add("COMPUTER");

        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}
