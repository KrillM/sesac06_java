package N01_basicSyntax;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    void print(){
        System.out.println("name is "+name+", age is "+age);
    }
}

public class Ex02_dataType {
    public static void main(String[] args) {
        // 배열 array
        int[]x=new int[5];

        // 일반 for문
        for(int i=0;i<x.length;i++){
            x[i]=i+1;
        }

        // for-each문
        for(int i: x){
            System.out.print(i+" ");
        }

        System.out.println();

        // has관계
        Person p1 =new Person("krille", 29);
        Person p2 =new Person("jisu", 28);
        p1.print();
        p2.print();

        System.out.println(p1.getName()+", "+p2.getAge());
    }
}
