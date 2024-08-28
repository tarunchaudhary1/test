import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kahn_algo {
    public static void main(String[] args) {

    }
    public int[] findOrder(int n, int[][] arr) {
        ArrayList<ArrayList<Integer>> lis = new ArrayList<>();
        for(int i=0;i<n;i++) lis.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            lis.get(arr[i][1]).add(arr[i][0]);
        }
        int[] inDegree=new int[n];
        for(int i=0;i<n;i++){
            for(int in:lis.get(i)){
                inDegree[in]++;
            }
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<n;i++) if(inDegree[i]==0) que.add(i);
        int[] ans=new int[n];
        int i=0;
        int counter=0;
        while(!que.isEmpty()){
            int curr=que.poll();
            ans[i]=curr;
            counter++;
            i++;
            for(int ele:lis.get(curr)){
                inDegree[ele]--;
                if(inDegree[ele]==0) que.add(ele);
            }
        }
        if(counter<n) return new int[]{};
        return ans;
    }

}
