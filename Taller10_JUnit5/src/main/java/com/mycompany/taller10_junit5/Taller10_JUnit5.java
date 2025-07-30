/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller10_junit5;

/**
 *
 * @author CltControl
 */
// Clase CalculatorSMP
public class Taller10_JUnit5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String question = Operations.MakeFormula();
        System.out.println(question);
        String ret = Operations.Solve(question);
        System.out.println(ret);
    }
}
