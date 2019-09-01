import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            int[] arr = new int[N];

            for (int p = 0; p < N; ++p) {
                arr[p] = sc.nextInt();
            }
            StringBuilder res = new StringBuilder();

            res.append("Case #").append(i + 1).append(": ");
            for (int p = 0; p < Q; ++p) {
                int index = sc.nextInt();
                int val = sc.nextInt();

                arr[index] = val;
                int max = maxSubArray(arr);

                res.append(max);
                if (p < Q - 1) {
                    res.append(" ");
                }
            }

            System.out.println(res.toString());
        }
    }

    private static int maxSubArray(int[] nums) {
        int max = 0;
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            dp[i] = nums[i];
            max = Math.max(max, isXSum(nums[i]) ? 1 : max);
        }

        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                dp[j] ^= nums[i];
                max = Math.max(max, isXSum(dp[j]) ? i + 1 - j : max);
            }
        }

        return max;
    }

    private static boolean isXSum(int sum) {
        int count = (sum & 1) == 1 ? 1 : 0;

        while (sum != 0) {
            sum >>= 1;

            if ((sum & 1) == 1) {
                ++count;
            }
        }

        return count % 2 == 0;
    }
}