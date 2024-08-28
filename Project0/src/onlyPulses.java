import java.util.Scanner;

public class onlyPulses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int a=scan.nextInt();
            int b= scan.nextInt();
            int c= scan.nextInt();
            for(int j=0;j<5;j++){
                if(a*b>=a*c && a*b>=b*c) c++;
                else if(a*c>=a*b && a*c>=b*c) b++;
                else a++;
            }
            System.out.println(a*b*c);
        }

    }
}
