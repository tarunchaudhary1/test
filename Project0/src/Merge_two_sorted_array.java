public class Merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,6,7,11,19,20,23};
        int[] arr2 = {1,3,5,6,8,9,10};
        int[] ans = Merge(arr1,arr2);
        for (int an : ans) {
            System.out.println(an + " ");
        }
    }
    public static int[] Merge(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];
        int i = 0 ,j =0, k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
