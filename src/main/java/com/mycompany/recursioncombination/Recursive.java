/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursioncombination;

/**
 *
 * @author sph
 */
public class Recursive extends Combination {

    public int combination(int n, int r) {
//        System.out.println(n + " " + r);
        if (r > n) {
            return -1; // not possible!
        } else if (r == 0 || r == n) {
            return 1;
        }

        return combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
