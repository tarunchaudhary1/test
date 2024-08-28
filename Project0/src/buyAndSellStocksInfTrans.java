public class buyAndSellStocksInfTrans {
    public static void main(String[] args) {
        int n=10;
        int[] arr = {4,2,8,1,8,9,5,10,11,12};
        int bd = 0;
        int sd=0;
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                sd++;
            }
            else {
                profit+=arr[sd]-arr[bd];
                bd = sd = i;
            }
        }
        profit+=arr[sd]-arr[bd];
        System.out.println(profit);
    }
}
