package lab_27.task_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Name {
    public static Map<String, String> createMap(){
        Map<String, String> name = new HashMap<>();
        name.put("Bui", "Van Thanh");
        name.put("Nguyen", "The Vinh");
        name.put("Nghiem", "Vu Vinh");
        name.put("Mai", "Khanh Huyen");
        name.put("Mai", "Van Nam");
        name.put("Le", "Van Tuan");
        name.put("Mai", "Van Phong");
        name.put("Phan", "Thi Mai");
        name.put("Dinh", "Van Tuan");
        name.put("Mai", "Van Tuan");
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
