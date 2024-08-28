public class paintFence {
    public static void main(String[] args) {
        int n=8;
        int k=3;
        int same = k*1;
        int diff = k*(k-1);
        int total = same + diff;
        for(int i=3;i<=n;i++){
            same = diff*1;
            diff = total*(k-1);
            total = same +diff;
        }
        System.out.println(total);
    }
}
