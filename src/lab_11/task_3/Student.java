package lab_11.task_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String speciality;
    private int course;
    private String group;
    private int gpa;
    private Calendar DateOfBirth;
    public Student(String firstName, String lastName, String speciality, int course, String group,int gpa,int year, int month, int day){
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.DateOfBirth = Calendar.getInstance();
        DateOfBirth.set(Calendar.YEAR,year);
        DateOfBirth.set(Calendar.MONTH, month);
        DateOfBirth.set(Calendar.DAY_OF_MONTH,day);
    }

    public Student(int year, int month, int day)
    {
        this("Sofi", "F1", "Game",2,"IKBO-06-21",5,year,month,day);
    }


    public int getGpa() {
        return gpa;
    }

    public String toString(String typeDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(typeDate);
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                ", DateOfBirth='" + dateFormat.format(this.DateOfBirth.getTime()) + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter\ndate of birth: "); int date = in.nextInt();
        System.out.print("month of birth: "); int month = in.nextInt();
        System.out.print("year of birth: "); int year = in.nextInt();
        System.out.println("Enter date of birth format: "); in.nextLine(); String typeDate = in.nextLine();
        Student student = new Student(year, month, date);
        System.out.println(student.toString(typeDate));
    }
}

