package N06_inheritance;

class Animal{
    private String species;
    private String name;
    private int age;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("동물은 소리를 낸다.");
    }
}

class Dog extends Animal{
    Dog(String name, int age){
        super("강아지", name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("멍멍멍");
    }
}

class Cat extends Animal{
    Cat(String name, int age){
        super("고양이", name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("냥냥냥");
    }
}

public class Q01_Animals {
    public static void main(String[] args) {
        Dog dog = new Dog("몽이", 10);
        Cat cat = new Cat("래리", 17);

        dog.makeSound();
        cat.makeSound();
    }
}
