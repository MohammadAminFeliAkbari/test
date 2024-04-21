public class Student extends Person {
    private int Id;
    private double grades;

    public Student(String first_name, String last_name, int Id, double grades) {
        super(first_name, last_name);
        this.grades = grades;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", grades=" + grades +
                ", First_name='" + First_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                '}';
    }
}
