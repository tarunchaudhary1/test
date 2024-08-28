public class maxSumNonAdjacentElement {
    public static void main(String[] args) {
        int[] arr = { 5,10,10,100,5,6};
        int n = arr.length;
        int inc=arr[0];
        int exc=0;
        for(int i=1;i<n;i++){
            int ninc= exc+arr[i];
            int nexc = Math.max(inc,exc);
            inc = ninc;
            exc=nexc;
        }
        System.out.println(Math.max(inc,exc));
    }
}
