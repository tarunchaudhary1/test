import java.util.Scanner;

public class bit_manipulataion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();
        int m=scan.nextInt();

        int onMask=(1<<i);
        int offMask=~(1<<j);
        int tMask=(1<<k);
        int cMask=(1<<m);
        int rightMostSetBitMask=(n&-n);

        System.out.println(Integer.toBinaryString(rightMostSetBitMask));
        System.out.println(n|onMask);
        System.out.println(n&offMask);
        System.out.println(n^tMask);
        System.out.println((n & cMask) != 0);
        byte a=-128;
        System.out.println(a>>2);
    }
}
//10000000