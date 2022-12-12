package lab_19.task_2;

public class LabClassDriver implements LabClassUI{

    @Override
    public Student search(String name, Student... students) {
        for (int i = 0; i < students.length; i++)
            if(name.equals(students[i].getName()))
                return students[i];
        return null;
    }

    @Override
    public Student[] sort(Student... students) {
        int size = students.length;
        for (int i = 1; i < size; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getGpa() > key.getGpa()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
        return students;
    }
}
