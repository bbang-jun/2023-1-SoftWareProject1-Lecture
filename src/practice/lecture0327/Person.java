package practice.lecture0327;

public class Person {
    String name;
    String job;
    int age;

    Person(){
        name = "";
        job = "";
        age = 0;
    }

    Person(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    void Introduce(){
        System.out.printf("제 이름은 %s 입니다.\n", name);
        System.out.printf("나이는 %d 입니다.\n", age);
        System.out.printf("직업은 %s 입니다.\n", job);
    }
}
