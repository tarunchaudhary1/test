public class buyAndSellStocksWithCoolDown {
    public static void main(String[] args) {
        int n=10;
        int[] arr = {4,2,8,1,8,9,5,10,11,12};
        int obsp=-arr[0];
        int ossp=0;
        int ocsp=0;
        for(int i=1;i<arr.length;i++){
            int nbsp=0;
            int nssp=0;
            int ncsp=0;
            if(ocsp-arr[i]>obsp){
                nbsp=ocsp-arr[i];
            }
            else{
                nbsp=obsp;
            }
            if(obsp+arr[i]>ossp){
                nssp=obsp+arr[i];
            }
            else {
                nssp=ossp;
            }
            if(ossp>ocsp){
                ncsp=ossp;
            }
            else{
                ncsp=ocsp;
            }
            obsp=nbsp;
            ossp=nssp;
            ocsp=ncsp;
        }
        System.out.println(ossp);
    }
}
