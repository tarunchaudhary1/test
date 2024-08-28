import java.util.*;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<List<String>> res = new ArrayList<>();
        List<String> lis = new ArrayList<>();
        Partitioning(ques,lis,res);
        System.out.println(res);
    }

    public static void Partitioning(String ques,List<String> lis, List<List<String>> res){
        if(ques.length()==0){
            res.add(new ArrayList<>(lis));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s = ques.substring(0,i);
            if(isPalindrome(s)==true){
                lis.add(s);
                Partitioning(ques.substring(i),lis,res);
                lis.remove(lis.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
