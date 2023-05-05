import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Iterator;

import codingtest.CT9_java_review.Person;
import codingtest.CT9_java_review.Student;

public class Example {
    public static void main(String[] args) {

        Vector<Person> personVector = new Vector<>();
        LinkedList<Student> studentLinkedList = new LinkedList<>();

        String[][] InputList = {{"Hanks Tom", "25", "Male", "Actor"},{"Taehyun Eom", "29", "Male", "Student", "KW Univ"}
                ,{"Heung-Min Son", "30", "Male", "Football Player"},{"GilDong Hong", "17", "Male", "Student", "KW HighSchool"}
                ,{"Jenny","27","Female","Singer"}, {"Dami Kim","28","Female","Actor"}};

        for(int i = 0; i<6; i++) {
            try{
                String Full_Name = InputList[i][0];
                ArrayList<String> parsedName = NameParser(Full_Name);

                int age = Integer.valueOf(InputList[i][1]);
                String Gender = InputList[i][2];
                String Job = InputList[i][3];
                String SchoolName = InputList[i][4];

                Person p_tmp = new Person(parsedName.get(0), parsedName.get(1), age, Gender, Job);
                personVector.add(p_tmp);

                Student s_tmp = new Student(parsedName.get(0), parsedName.get(1), age, Gender, Job, SchoolName );
                studentLinkedList.add(s_tmp);
            }
            catch(Exception e){
                /*
                String Full_Name = InputList[i][0];
                ArrayList<String> parsedName = NameParser(Full_Name);

                int age = Integer.valueOf(InputList[i][1]);
                String Gender = InputList[i][2];
                String Job = InputList[i][3];

                Person p_tmp = new Person(parsedName.get(0), parsedName.get(1), age, Gender, Job);
                personVector.add(p_tmp);
                 */
            }
        }

        System.out.println("=============== Person List ====================");
        Iterator<Person> iterator = personVector.iterator();
        while(iterator.hasNext()){
            Person tmp = iterator.next();
            tmp.printInfo();
            System.out.println();
        }
        System.out.println();
        System.out.println("=============== Student List ====================");
        for(Student stu : studentLinkedList){
            stu.printInfo();
            System.out.println();
        }
    }


    public static ArrayList<String> NameParser(String Input){

        String First_Name = "";
        String Last_Name = "";

        int delimeter_idx = Input.indexOf(" ");

        for(int i = 0; i<Input.length() ; i++){
            if(i < delimeter_idx)
                First_Name = First_Name + Input.charAt(i);
            else if(i > delimeter_idx)
                Last_Name = Last_Name + Input.charAt(i);
            else
                continue;
        }

        ArrayList <String> tmp = new ArrayList<>();
        tmp.add(First_Name);
        tmp.add(Last_Name);

        return tmp;
    }
}
