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

    private long fact(long val) {
        if (val < 0) {
            return -1; // not possible!
        }

        int retVal = 1;
        for (int i = 1; i <= val; i++) {
            retVal *= i;
        }
        return retVal;
    }

    public long combination(long n, long r) {
        if (r > n) {
            return -1; // not possible!
        }

        // nCr = (n!)/((n-r)!r!)
        return (fact(n)) / ((fact(n - r)) * fact(r));
    }
}
