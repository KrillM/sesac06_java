package N03_array;


import java.util.ArrayList;
import java.util.Arrays;

class Student{
    private String name;

    private int age;

    public String getName(){return name;}
    public int getAge(){return age;}

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class Ex05_classList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("krille", 29));

        Student std = new Student("yena", 22);
        students.add(std);

        students.add(new Student("jisu", 19));

        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i).getName()+" "+students.get(i).getAge());
        }

        // 불러오기
        Student jisu= students.get(2);
        System.out.println(jisu.getName()+" is "+jisu.getAge()+" years old");

        // for each 사용
        for(Student list: students){
            System.out.println(list.getName()+" "+list.getAge());
        }
    }
}
