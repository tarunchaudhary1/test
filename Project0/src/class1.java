//import java.util.*;
//import java.util.LinkedList;
//
//public class class1 {
//    public static void Matrix2DTraversal(int i,int j,int[][] matrix,boolean[][] visited){
//        if(i<0 || j<0 || j>=matrix[0].length || i>=matrix.length){
//            return;
//        }
//        if(!visited[i][j]){
//            visited[i][j] = true;
//            System.out.print(matrix[i][j] + " ");
//        }
//        Matrix2DTraversal(i-1,j,matrix,visited); //* TOP
//        Matrix2DTraversal(i,j+1,matrix,visited); //* RIGHT
//        Matrix2DTraversal(i+1,j,matrix,visited); //* BOTTOM
//        Matrix2DTraversal(i,j-1,matrix,visited); //* LEFT
//    }
//    public static void mat_dfs(int row,int col,int[][] mat,boolean[][] visited){
//        visited[row][col] = true;
//        System.out.print(mat[row][col]+" ");
//        int[] di = {0,1,0,-1};
//        int[] dj = {1,0,-1,0};
//        for(int i=0;i<4;i++){
//            int nbr_x = row+dj[i];
//            int nbr_y = col+di[i];
//            if(nbr_x>=0 && nbr_x < mat.length && nbr_y<mat[0].length && nbr_y>=0 && !visited[nbr_x][nbr_y]){
//                visited[nbr_x][nbr_y] = true;
//                mat_dfs(nbr_x,nbr_y,mat,visited);
//            }
//        }
//    }
//    public static void mat_bfs(int row,int col,int[][] mat){
//        int rows = mat.length;
//        int cols = mat[0].length;
//        boolean[][] visited = new boolean[rows][cols];
//        Queue<int[]> q = new LinkedList<>();
//        q.add(new int[]{row, col});
//        visited[row][col] = true;
//        while(!q.isEmpty()){
//            int[] curr = q.remove();
//            System.out.print(mat[curr[0]][curr[1]]+" ");
//            int curr_x = curr[0];
//            int curr_y = curr[1];
//            int[] di = {0,1,0,-1};
//            int[] dj = {1,0,-1,0};
//            for(int i=0;i<4;i++){
//                int nbr_x = curr_x+di[i];
//                int nbr_y = curr_y+dj[i];
//                if(nbr_x>=0 && nbr_x < mat.length && nbr_y<mat[0].length && nbr_y>=0 && !visited[nbr_x][nbr_y]){
//                    q.add(new int[]{nbr_x,nbr_y});
//                    visited[nbr_x][nbr_y] = true;
//                }
//            }
//        }
//    }
//
//    //? island wala question
//    public static void mat_bfs_all(int[][] mat){
//        int rows = mat.length;
//        int cols = mat[0].length;
//        boolean[][] visited = new boolean[rows][cols];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                if(mat[i][j]==1 && !visited[i][j]){
//                    mat_bfsConnectall(i,j,mat);
//                }
//            }
//        }
//    }
//    public static void mat_bfsConnectall(int row,int col,int[][] mat){
//        int rows = mat.length;
//        int cols = mat[0].length;
//        boolean[][] visited = new boolean[rows][cols];
//        Queue<int[]> q = new LinkedList<>();
//        q.add(new int[]{row, col});
//        visited[row][col] = true;
//        while(!q.isEmpty()){
//            int[] curr = q.remove();
//            System.out.print(mat[curr[0]][curr[1]]+" ");
//            int curr_x = curr[0];
//            int curr_y = curr[1];
//            int[] di = {0,1,0,-1};
//            int[] dj = {1,0,-1,0};
//            for(int i=0;i<4;i++){
//                int nbr_x = curr_x+di[i];
//                int nbr_y = curr_y+dj[i];
//                if(nbr_x>=0 && nbr_x < mat.length && nbr_y<mat[0].length && nbr_y>=0 && mat[nbr_x][nbr_y]==1 && !visited[nbr_x][nbr_y]){
//                    q.add(new int[]{nbr_x,nbr_y});
//                    visited[nbr_x][nbr_y] = true;
//                }
//            }
//        }
//    }
//}
//}
