import java.util.ArrayList;
import java.util.Scanner;

public class zoroNetwork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i <m; i++) {
            int src = scan.nextInt();
            int dist = scan.nextInt();
            adj.get(src).add(dist);
            adj.get(dist).add(src);
        }
        //star
        int one=1;
        int other=n-1;
        for(int i=1;i<adj.size();i++){
            if(adj.get(i).size()==n-1){
                one--;
            }
            if(adj.get(i).size()==1){
                other--;
            }
        }
        if(other==0 && one==0){
            System.out.println("star topology");
            return;
        }
        //ring
        int all=n;
        for(int i=1;i<adj.size();i++){
            if(adj.get(i).size()==2){
                all--;
            }
        }
        if(all==0){
            System.out.println("ring topology");
            return;
        }
        //bus
        int two=2;
        other = n-2;
        for(int i=1;i<adj.size();i++){
            if(adj.get(i).size()==1){
                two--;
            }
            if(adj.get(i).size()==2){
                other--;
            }
        }
        if(other==0 && two==0){
            System.out.println("bus topology");
            return;
        }
        System.out.println("unknown topology");
    }
}
