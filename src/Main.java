public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        for(int i=2;i<10;i++){
            System.out.println("\n"+i+"단");
            for(int j=1;j<10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}