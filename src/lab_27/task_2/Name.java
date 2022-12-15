package lab_27.task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Name {
    public static Map<String, String> createMap(){
        Map<String, String> name = new HashMap<>();
        name.put("Ruvik", "F1");
        name.put("Ger", "F3");
        name.put("Ger", "F3");
        name.put("Ruvik", "F1");
        name.put("Sofi", "F2");
        name.put("Sofi", "F2");
        name.put("Ruvik", "F1");
        name.put("Ger", "F3");
        name.put("Sofi", "F2");
        name.put("Ruvik", "F1");
        return name;
    }

    public static int getSameFirstNameCount (Map<String,String> name){
        return 11 - name.size();
    }

    public static int getSameLastNameCount (Map<String,String> name){
        int mount = 1;
        List<String> lastName = new ArrayList<>();
        lastName.addAll(name.values());
        for (int i = 0; i < lastName.size();  i++){
            for (int j = i + 1; j < lastName.size(); j++){
                if(lastName.get(i).equals(lastName.get(j))){
                    lastName.remove(j--);
                    mount++;
                }
            }
        }
        return mount;
    }

    public static void main(String[] args) {
        Map<String,String> map = createMap();
        System.out.println("The number of first name is the same: " + getSameFirstNameCount(map));
        System.out.println("The number of last name is the same: " + getSameLastNameCount(map));
    }
}
