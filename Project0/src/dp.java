
import java.util.*;

public class dp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 2};
        int x = 1;
        int result = goodSubarrays(arr.length, arr, x);
        System.out.println(result);
    }

    public static int goodSubarrays(int n, int[] arr, int x) {
        int count = 0;
        int[] freq = new int[n + 1];
        int good = 0;
        freq[0] = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                good++;
            }
            if (good >= 3) {
                count += freq[good - x];
            }
            freq[good]++;
        }
        return count;
    }
}