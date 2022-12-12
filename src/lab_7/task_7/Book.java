package lab_7.task_7;

public class Book {
    public static void printBook(Printable[] printables){
        for (int i = 0; i < printables.length; i++)
            if(printables[i] instanceof Printable)
                System.out.println(printables[i].getName());
    }
}
