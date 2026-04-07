/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursioncombination;

/**
 *
 * @author sph
 */
public class RecursionCombination {

    public static void main(String[] args) {
        Combination iter = new Iterative();
        Combination recu = new Recursive();
        
        System.out.println(recu.combination(6, 3));
    }
}
