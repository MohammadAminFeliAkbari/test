public class Person {
    protected String First_name;
    protected String Last_name;

    public Person(String first_name , String last_name)
    {
        this.First_name = first_name;
        this.Last_name  = last_name;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }
}
