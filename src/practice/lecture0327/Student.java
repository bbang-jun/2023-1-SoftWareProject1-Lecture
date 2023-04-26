package practice.lecture0327;

public class Student extends Person{
    String univ;
    int admission;

    Student(String name, int age, String job, String univ, int admission){
        this.name = name;
        this.age = age;
        this.job = job;
        this.admission = admission;
    }

    @Override
    void Introduce(){
        super.Introduce();
        System.out.printf("학교는 %s 입니다.\n", univ);
        System.out.printf("학번은 %s 입니다.\n", admission);
    }

    void Introduce(String department){
        System.out.printf("제 이름은 %s 입니다.\n", name);
        System.out.printf("나이는 %d 입니다.\n", age);
        System.out.printf("직업은 %s 입니다.\n", job);
        System.out.printf("학교는 %s 입니다.\n", univ);
        System.out.printf("학번은 %s 입니다.\n", admission);
        System.out.printf("과는 %s 입니다.\n", department);
    }
}
