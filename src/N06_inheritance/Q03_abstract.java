package N06_inheritance;

abstract class Student{
    private String name;
    private String school;
    private int age;
    private int number;

    abstract void todo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

class Kim extends Student{

    Kim(String name, String school, int age, int number){
        setName(name);
        setSchool(school);
        setAge(age);
        setNumber(number);
    }

    @Override
    public void todo(){
        System.out.println("=== "+getName()+" 학생의 정보 ===");
        System.out.println("학교: "+getSchool()+"고등학교");
        System.out.println("나이: "+getAge());
        System.out.println("학번: "+getNumber());
        System.out.println("점심은 김가네 김밥");
    }
}

class Baek extends Student{
    @Override
    public void todo(){
        System.out.println("=== "+getName()+" 학생의 정보 ===");
        System.out.println("학교: "+getSchool()+"고등학교");
        System.out.println("나이: "+getAge());
        System.out.println("학번: "+getNumber());
        System.out.println("점심은 백종원 짬뽕");
    }
}

public class Q03_abstract {
    public static void main(String[] args) {
        Student kim= new Kim("김민재", "뮌헨", 17, 20230304);
        Student baek = new Baek();

        kim.todo();

        baek.setName("백제인");
        baek.setSchool("완산주");
        baek.setAge(18);
        baek.setNumber(660936);

        baek.todo();

    }
}
