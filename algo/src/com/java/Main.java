package com.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(1+"asd");
    }


    private static int recursive(int n) {
        if (n == 0)
            return 1;
        System.out.println("before: " + n);
        return 1 + recursive(n - 1);
    }

    private static int dpPath(int n, int m) {
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[n-1][m-1];
    }


}
