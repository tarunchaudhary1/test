import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int count = count(nums);
        System.out.println(count);
    }
    public static int count(int[] nums){
        int n=nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int and = nums[i] & nums[j];
                hm.put(and, hm.getOrDefault(and, 0) + 1);
            }
        }
        int count = 0;
        for (int k = 0; k < n; k++) {
            for (int key : hm.keySet()) {
                if ((key & nums[k]) == 0) {
                    count += hm.get(key);
                }
            }
        }
        return count;
    }
}