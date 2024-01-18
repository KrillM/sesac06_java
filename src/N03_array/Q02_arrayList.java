package N03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q02_arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> words= new ArrayList<>();
        boolean typing=true;

        while(typing){
            System.out.println("문자를 입력해주세요");
            String x = sc.next();
            words.add(x);

            if(x.equals("exit")){
                for(int i=0;i<words.size()-1;i++){
                    System.out.println(words.get(i));
                }
                typing=false;
            }
        }
    }
}
