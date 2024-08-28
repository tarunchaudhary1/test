import java.util.*;

public class assignment {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.next();
        }

    }
    public static String printReplace(String str){
        if(str.length()<2){
            return str;
        }
        if(str.substring(0,2).equals("pi")){
            return "3.14" + printReplace(str.substring(2));
        }
        return str.charAt(0) + printReplace(str.substring(1));
    }
}