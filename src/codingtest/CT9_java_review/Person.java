package codingtest.CT9_java_review;

public class Person {
    private String First_Name;
    private String Last_Name;
    private int age;
    private String Gender;
    private String job;


    public Person(String First_Name, String Last_Name, int age, String Gender, String job){
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Gender = Gender;
        this.age = age;
        this.job = job;
    }

    public void printInfo(){
        System.out.printf("Name : %s %s\n", First_Name, Last_Name);
        System.out.printf("Age : %d\n", age);
        System.out.printf("Gender : %s\n", Gender);
        System.out.printf("Job : %s\n", job);
    }
}

