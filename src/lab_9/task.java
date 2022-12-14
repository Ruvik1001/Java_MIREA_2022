package lab_9;

import java.util.Comparator;

public class task {
    static class Student {
        private String name;
        private int age;
        private int iDNumber;
        private int gpa;

        public Student(String name, int age, int iDNumber, int gpa) {
            this.name = name;
            this.age = age;
            this.iDNumber = iDNumber;
            this.gpa = gpa;
        }

        public int getGpa() {
            return this.gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", iDNumber=" + iDNumber +
                    ", gpa=" + gpa +
                    '}';
        }
    }

    public static class SortingStudentsByGPA implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getGpa() - s2.getGpa();
        }
    }

    public static Student[] insertionSort(Student[] students) {
        int size = students.length;
        for (int i = 1; i < size; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].gpa > key.gpa) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
        return students;
    }

    public static void swap(Student[] students, int l, int r) {
        Student temp = students[l];
        students[l] = students[r];
        students[r] = temp;
    }

    public static Student[] quickSort(Student[] students, int left, int right, Comparator<Student> comparator) {
        int l = left;
        int r = right;
        if (r > l) {
            Student temp = students[(l + r) / 2];
            while (l <= r) {
                while (l < right && comparator.compare(students[l], temp) < 0) l++;
                while (r > left && comparator.compare(students[r], temp) > 0) r--;
                if (l <= r) swap(students, l++, r--);
            }
            if (left < r) quickSort(students, left, r, comparator);
            if (l < right) quickSort(students, l, right, comparator);
        }
        return students;
    }

    public static void merge(Student[] students, int start, int mid, int end, Comparator<Student> comparator) {
        Student[] temp = new Student[students.length];
        int spot = start;
        int pos1 = start;
        int pos2 = mid + 1;

        while (!(pos1 > mid && pos2 > end)) {
            if ((pos1 > mid) || (pos2 <= end) && (comparator.compare(students[pos2], students[pos1]) < 0))
                temp[spot++] = students[pos2++];
            else
                temp[spot++] = students[pos1++];
        }

        for (int i = start; i <= end; i++) students[i] = temp[i];
    }

    public static void mergeSort(Student[] students, int start, int end, Comparator<Student> comparator) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(students, start, mid, comparator);
            mergeSort(students, mid + 1, end, comparator);
            merge(students, start, mid, end, comparator);
        }
    }

    public static Student[] mergeArr(Student[] s1, Student[] s2, Student[] s3, int n, int m, Comparator<Student> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < n) s3[k++] = s1[i++];
        while (j < m) s3[k++] = s2[j++];
        mergeSort(s3, 0, s3.length - 1, comparator);
        return s3;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ruvik", 18, 106, 4);
        students[1] = new Student("Sofi", 14, 103, 2);
        students[2] = new Student("Ger", 26, 102, 5);
        System.out.println("Array before insertion sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students[i]);
        students = insertionSort(students);
        System.out.println("\nArray after insertion sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students[i]);
        Student[] students_1 = new Student[3];
        Comparator<Student> comparator = new SortingStudentsByGPA();
        students_1[0] = new Student("Ruvik", 22, 105, 1);
        students_1[1] = new Student("Sofi", 20, 103, 7);
        students_1[2] = new Student("Ger", 26, 102, 3);
        System.out.println("\nArray before quick sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students_1[i]);
        students_1 = quickSort(students_1, 0, students_1.length - 1, comparator);
        System.out.println("\nArray after quick sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students_1[i]);
        Student[] students_2 = new Student[students.length + students_1.length];
        students_2 = mergeArr(students, students_1, students_2, students.length, students_1.length, comparator);
        System.out.println("\nArray after merge sorting:");
        for (int i = 0; i < 6; i++)
            System.out.println(students_2[i]);

    }
}
