package N02_controlStatement;

public class Ex03_loopController {
    public static void main(String[] args) {

        // for문으로 만든 구구단
        for(int i=2;i<10;i++){
            System.out.println(i+"단");
            for(int j=1;j<10;j++){
                System.out.println(i+" x " +j+" = "+(i*j));
            }
            System.out.println();
        }

        // while문으로 만든 구구단
        int x=2;
        while(x<10){
            System.out.println(x+"단");
            int y=1;

            while(y<10){
                System.out.println(x+" x " +y+" = "+(x*y));
                y++;
            }
            y=1;
            x++;
        }

        // do-while
        int j=1;
        do {
            System.out.println(j);
            j++;
        } while(j>11);

        // for-each
        // collection type
        // 1. 데이터에서 데이터가 존재하는 개수만큼 반복 실행
        // 2. 데이터를 저장하고 관리하는 자료구조를 제공하는 클래스 모음이다.
        // Ex. List, Set, Map, Stack, Vector 등등
    }
}
