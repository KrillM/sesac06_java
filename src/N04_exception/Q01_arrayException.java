package N04_exception;

public class Q01_arrayException {
    public static void main(String[] args) {
        int[]x=new int[4];

        try{
            for(int i=0;i<5;i++){
                x[i]=i+1;
                System.out.println(x[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }
        finally {
            System.out.println("finally console.");
        }
    }
}
