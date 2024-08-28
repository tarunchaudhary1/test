public class permut {
    public static void main(String[] args) {
        String ques="1234";
        permutt(ques,"");
    }
    public static void permutt(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            permutt(s1+s2,ans+ques.charAt(i));
        }
    }
}
