package N04_exception;

public class Ex02_nullException {
    public static void main(String[] args) {
        String x="";

        try{
            System.out.println(x.length());
        } catch (NullPointerException e){
            System.out.println("단어 길이를 알 수 없어요.");
        }
    }
}
