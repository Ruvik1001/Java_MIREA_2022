package lab_13.task_1;

public class task_1 {
    public static String func(String str){
        return str;
    }

    public static void main(String[] args) {
        //1
        String s = "I like Java!!!";
        System.out.println(func(s));
        //2
        String st = "Have a good day";
        System.out.println(st.charAt(st.length()-1));
        //3
        if(s.endsWith("!!!"))
            System.out.println("Strings ending with \"!!!\"");
        //4
        if(s.startsWith("I like"))
            System.out.println("Strings starting with \"I like\"");
        //5
        if(s.contains("Java"))
            System.out.println("String containing \"Java\"");
        //6
        System.out.println(s.indexOf("Java"));
        //7
        System.out.println(s.replace('a','o'));
        //8
        System.out.println(s.toUpperCase());
        //9
        System.out.println(s.toLowerCase());
        //10
        String str = s.substring(7);
        System.out.println(str);
    }
}
