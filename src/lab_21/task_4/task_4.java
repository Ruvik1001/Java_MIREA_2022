package lab_21.task_4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class task_4 {
    public static void Filelist(String path){
        File f = new File(path);
        String[] fArray = null;
        if (f.exists()||f.isDirectory()) fArray = f.list(null);
        else System.out.print("Папка не найдена");
        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));

        for (int i =0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Filelist("D:\\");
    }
}
