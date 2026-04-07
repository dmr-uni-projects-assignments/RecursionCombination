/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursioncombination;

/**
 *
 * @author sph
 */
public class Iterative extends Combination {

    public long combination(long n, long r) {
        if (r > n) {
            return -1; // not possible!
        }

        long[][] dp = new long[(int) n + 1][(int) r + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {

                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[(int) n][(int) r];
    }
}
