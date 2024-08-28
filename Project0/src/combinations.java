import java.util.*;
public class combinations {
    public static void main(String[] args) {
        List<List<Integer>> lis=combine(4,2);
        System.out.println(lis);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lis = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        return rec(n,k,lis,list,1);
    }
    public static List<List<Integer>> rec(int n, int k, List<List<Integer>> lis , List<Integer> list, int idx){
        if(list.size()==k){
            lis.add(new ArrayList<>(list));
            return lis;
        }
        for(int i=idx;i<=n;i++){
            list.add(i);
            rec(n,k,lis,list,idx+1);
            list.remove(Integer.valueOf(i));
        }
        return lis;
    }
}
