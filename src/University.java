import java.util.Arrays;

public class University {
    private Student[] students;
    private int counter = 0;

    public University(int number_stu) {
        students = new Student[number_stu];
    }

    public void add_student(Student str) {
        students[counter++] = str;

        for (int i = 0; i < counter; i++)
            for (int j = 0; j < counter - 1; j++)
                if (students[j] != null && students[j + 1] != null)
                    if (students[j + 1].getFirst_name().compareTo(students[j].getFirst_name()) > 0) {
                        Student test = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = test;
                    }
    }

    public void delete(Student stu) {
        for (int i = 0; i < counter; i++)
            if (stu == students[i]) {
                students[i] = null;

                for (int j = i; j < counter; j++)
                    if (students[j + 1] != null) {
                        students[j] = students[j + 1];
                        students[j + 1] = null;
                    }
                break;
            }
    }



    @Override
    public String toString() {
        return "University{" +
                "students=" + Arrays.toString(students) +
                ", counter=" + counter +
                '}';
    }
}
