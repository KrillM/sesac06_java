package N05_class;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name;
    private int number;
    private int grade;
    static private int totalStudents = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void setTotalStudents(int totalStudents) {
        Student.totalStudents = totalStudents;
    }

    Student(String name, int number, int grade){
        this.name=name;
        this.number=number;
        this.grade=grade;
        setTotalStudents(getTotalStudents() + 1);
    }

    public void displayInfo(){
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + getName());
        System.out.println("학번: " + getNumber());
        System.out.println("학년: " + getGrade());
    }
}

public class Q02_staticStudents {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while(true){
            System.out.println("이름, 학번, 학년을 순서대로 입력하시오.");
            String x = sc.next();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if(x.equals("stop")){
                for(int i=0;i<students.size();i++){
                    students.get(i).displayInfo();
                }
                break;
            }

            students.add(new Student(x, y, z));
        }

        System.out.println("학생 수 "+Student.getTotalStudents());
    }
}
