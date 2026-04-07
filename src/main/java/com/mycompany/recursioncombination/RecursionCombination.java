/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursioncombination;

/**
 *
 * @author sph
 */
public class RecursionCombination {

    private static long rand(long min, long max) {
        return min + (long) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) {
        Combination iter = new Iterative();
        Combination recu = new Recursive();

        System.out.println("Testing function reliability: ");
        for (int i = 0; i < 10; i++) {
            long n = rand(4, 6);
            long r = rand(1, 3);
            long iterres = iter.combination(n, r);
            long recures = recu.combination(n, r);
            System.out.println(n + "C" + r + " = " + iterres + " " + recures);
            if (iterres != recures) {
                System.out.println("Functions are not working properly");
                return;
            }
        }
        System.out.println("Both implementations are working properly.");

        System.out.println("Testing function limits: ");
        long v = 0;
        try {
            while (true) {
//                long iterres = iter.combination(v, v);
                long recures = recu.combination(v, v);
                System.out.println("Testing " + v + "C" + v);
                v++;
            }
        } catch (Exception e) {
            System.out.println("Exception " + e + " occured.");
        }
    }
}
