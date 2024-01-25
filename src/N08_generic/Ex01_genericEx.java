package N08_generic;

import java.util.ArrayList;

// 제네릭 클래스
class CustomListGeneric<T>{
    ArrayList<T> list = new ArrayList<T>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public T get(int i){
        return list.get(i);
    }

    @Override
    public String toString(){
        return "CustomListGeneric = " + list;
    }
}

public class Ex01_genericEx {
    public static void main(String[] args) {
        CustomListGeneric<Integer> genericListInt = new CustomListGeneric<>();
        genericListInt.addElement(1);
        genericListInt.addElement(3);
        genericListInt.addElement(6);
        genericListInt.removeElement(1);
        System.out.println(genericListInt.toString());

        Integer el = genericListInt.get(1);

        CustomListGeneric<Character> genericListChar = new CustomListGeneric<>();
        genericListChar.addElement('C');
        genericListChar.addElement('A');
        genericListChar.addElement('T');
        System.out.println(genericListChar.toString());
    }
}
