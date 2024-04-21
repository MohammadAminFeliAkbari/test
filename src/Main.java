public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("w" , "e" ,2233344 , 10);
        Student s2 = new Student("s" , "a" ,2233344 , 10);
        Student s3 = new Student("c" , "c" ,2233344 , 10);
        Student s4 = new Student("e" , "b" ,2233344 , 10);
        Student s5 = new Student("a" , "r" ,2233344 , 10);

        University university = new University(20);

        university.add(s1);
        university.add(s2);
        university.add(s3);
        university.add(s4);
        university.add(s5);

        System.out.println(university);
    }
}