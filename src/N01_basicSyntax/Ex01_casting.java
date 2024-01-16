package N01_basicSyntax;

public class Ex01_casting {
    public static void main(String[] args) {
        String name;
        name="krille";
        int birthYear = 1994;

        System.out.println("My name is "+name+" and I born in "+ birthYear);

        // 명시적 형변환(강제적 형변환)
        System.out.print("\n형 변환: ");
        int x = 10;
        double y = 3.14;
        int z = (int) y;

        System.out.println(x+", "+y+" and "+z);

        // 묵시적 형변환(Wider Conversion): 더 작은 타입에서 더 큰 타입으로, 역은 불가능
        int small = 10;
        double big = small;
        System.out.println("small "+small);
        System.out.println("big "+big);

        // 데이터 손실이 발생할 경우 주의해야 함
        System.out.println("\n데이터 손실 발생 주의!");
        int larger = 1000;
        byte bite = (byte) larger;
        System.out.println(larger);
        System.out.println(bite);
    }
}
