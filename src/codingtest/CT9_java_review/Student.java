package codingtest.CT9_java_review;

public class Student extends Person {
    private String School_Name;

    public Student(String First_Name, String Last_Name, int age, String Gender, String job, String School_Name) {
        super(First_Name, Last_Name, age, Gender, job);
        this.School_Name = School_Name;
    }

    void setSchool_Name(String School_Name) {
        this.School_Name = School_Name;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("School : %s\n", School_Name);
    }
}
