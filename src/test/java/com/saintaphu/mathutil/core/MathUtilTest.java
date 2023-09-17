/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.saintaphu.mathutil.core;

import static com.saintaphu.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    public MathUtilTest() {
        
    }
    
    // choi voi DDT (tham so hoa data)
    
    public static Object[][]initData(){
        return new Integer[][]{
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120},
            {5,720}
        };
    }
    @ParameterizedTest
    @MethodSource(value = "initData") // ten ham cung cap 
    //ngam dinh cac tham so dua vao ham
        public void testGetFactorialGivenRightArgReturnWell(int input,long expected){
        
        assertEquals(expected, getFatorial(input));
      
    }
//    @Test
//        public void testGetFactorialGivenRightArgReturnWell(){
//        
//        assertEquals(24, getFatorial(4));
//      
//    }
        
        @Test
        public void testGetFactorialGivenWrongArgReturnWell(){
        
        assertEquals(24, getFatorial(4));
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFatorial(-5);
////throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//        };
            assertThrows(IllegalArgumentException.class, ()-> getFatorial(-5));
    }

    
}
