package lab_18.task_8;

public class task_8 {
    public static void getKey(){
        String key = "";
            try {
                System.out.print("Enter key: ");
                if(key == "")
                    throw new ArithmeticException("Key is empty!");
            }catch (ArithmeticException arithmeticException)
            {
                System.out.println(arithmeticException);
            }
        printDetails( key );
    }
    public static void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) {
        return "data for " + key; }
    public static void main(String[] args) {
       getKey();
    }// end main
}
