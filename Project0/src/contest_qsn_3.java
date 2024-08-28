import java.util.Scanner;

public class contest_qsn_3 {
    static String[] keypad = {" ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static String[] searchIn = {
            "kartik", "sneha", "deepak", "arnav", "shikha", "palak",
            "utkarsh", "divyam", "vidhi", "sparsh", "akku"
    };
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        func(s,"");
    }
    public static void func(String s, String empty){
        if(s.length()==0){
            for(int i=0;i<searchIn.length;i++){
                if(searchIn[i].contains(empty)){
                    System.out.println(searchIn[i]);
                }
            }
            return;
        }
        char ch = s.charAt(0);
        int num = ch-'0';
        String ss = keypad[num];
        for(int i=0;i<ss.length();i++){
            char ch2 = ss.charAt(i);
            func(s.substring(1),empty+ch2);
        }
    }
}
