import java.util.Scanner;

public class BoardPaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N1 = scan.nextInt();
        int N2 = scan.nextInt();

        int totalPaths = countPaths(N1, N2, 1, 1, "");
        System.out.println(totalPaths);

        printPaths(N1, N2, 1, 1, "");
    }

    public static int countPaths(int N1, int N2, int cr, int cc, String path) {
        if (cr == N1 && cc == N2) {
            return 1;
        }

        if (cr > N1 || cc > N2) {
            return 0;
        }

        int right = countPaths(N1, N2, cr, cc + 1, path + "H");
        int down = countPaths(N1, N2, cr + 1, cc, path + "V");
        int diagonal = countPaths(N1, N2, cr + 1, cc + 1, path + "D");

        return right + down + diagonal;
    }

    public static void printPaths(int N1, int N2, int cr, int cc, String path) {
        if (cr == N1 && cc == N2) {
            System.out.print(path + " ");
            return;
        }

        if (cr > N1 || cc > N2) {
            return;
        }

        printPaths(N1, N2, cr, cc + 1, path + "H");
        printPaths(N1, N2, cr + 1, cc, path + "V");
        printPaths(N1, N2, cr + 1, cc + 1, path + "D");
    }
}
