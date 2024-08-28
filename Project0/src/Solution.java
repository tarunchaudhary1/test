

class Solution {
    public static int solution(String S, String T) {
        int n = S.length();
        int[] s = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = S.charAt(i) - '0';
            t[i] = T.charAt(i) - '0';
        }
        int diff = 0;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] != t[i]) {
                if (s[i] > t[i]) {
                    diff += s[i] - t[i];
                } else {
                    diff -= s[i] - t[i];
                }
                if (diff > 0) {
                    if (t[i] > s[i]) {
                        swaps++;
                        diff -= 2 * (t[i] - s[i]);
                    }
                } else {
                    if (s[i] > t[i]) {
                        swaps++;
                        diff += 2 * (s[i] - t[i]);
                    }
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        System.out.print(solution("29162","10524"));
    }
}

