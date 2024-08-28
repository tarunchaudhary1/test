public class queen_permutation {
    public static void main(String[] args) {
        int n=4;
        boolean[] board = new boolean[n];
        int tq=2;
        Permutation(board,tq,"",0);
    }

    public static void Permutation(boolean[] board,int tq, String ans,int qpsf){
        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                Permutation(board,tq,ans+"b"+i+"Q"+qpsf,qpsf+1);
                board[i]=false;
            }
        }
    }
}
