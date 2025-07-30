/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.taller10_junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CltControl
 */
public class OperationsTest {

    public OperationsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = "";
        String result = Operations.MakeFormula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    @DisplayName("Suma de 2 y 13 es 15")
    public void testSolveAdition() {
        System.out.println("Solve");
        String formula = "2+13";

        assertEquals("2+13=15", Operations.Solve(formula));
        assertThrows(NumberFormatException.class, () -> {
            Operations.Solve(formula);
        }, "Se esperaba 2+13=15");
    }

    @Test
    @DisplayName("Resta de 5 - 3 deberia salir 2")
    public void testSolveResta() {
        System.out.println("Solve");

        String formula = "5-3";
        assertEquals("5-3=2", Operations.Solve(formula));
        assertThrows(NumberFormatException.class, () -> {
            Operations.Solve(formula);
        }, "Se esperaba 5-3=2");

    }

}
