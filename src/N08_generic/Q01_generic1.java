package N08_generic;

import java.util.HashMap;
import java.util.Map;

class Pair<K, V>{

    HashMap<K, V> pair= new HashMap<K, V>();

    public void addElement(K key, V value){
        pair.put(key, value);
    }

    public void removeElement(K key){
        pair.remove(key);
    }

    public V get(K key){
        return pair.get(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<K, V> entry: pair.entrySet()){
            sb.append("Key: ").append(entry.getValue()).append(", Value: ").append(entry.getKey()).append("\n");
        }
        return sb.toString();
    }
}

public class Q01_generic1 {
    public static void main(String[] args) {
        Pair<String, String> pair =new Pair<>();
        pair.addElement("One", "1");
        pair.addElement("2", "Two");
        System.out.println(pair.toString());
    }
}
