public class queen_combination {
    public static void main(String[] args) {
        int n=5;
        boolean[] board = new boolean[n];
        int tq=3;
        Combination(board,tq,"",0,0);
    }
    public static void Combination(boolean[] board,int tq, String ans,int qpsf,int idx){
        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false) {
                board[i] = true;
                Combination(board, tq, ans + "b" + i + "Q" + qpsf, qpsf + 1,i+1);
                board[i] = false;
            }

        }
    }
}
