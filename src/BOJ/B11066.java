package BOJ;

import java.util.Scanner;

public class B11066 {
    public B11066() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[][] dp;

        for (int t = 0; t < T; t++) {
            int K = sc.nextInt();

            int[] sum = new int[K + 1];
            dp = new int[K + 1][K + 1];
            int input;

            for (int j = 1; j <= K; j++) {
                input = sc.nextInt();
                sum[j] += sum[j - 1] + input;
            }


            for (int k = 1; k < K; k++) {
                for (int i = 1; i <= K - k; i++) {
                    dp[i][i + k] = Integer.MAX_VALUE;
                    for (int j = i; j < i + k; j++) {
                        dp[i][i + k] = Math.min(dp[i][i + k], dp[i][j] + dp[j + 1][i + k]);
                    }

                    dp[i][i + k] += sum[i + k] - sum[i - 1];
                }
            }

            System.out.println(dp[1][K]);

        }
    }
}