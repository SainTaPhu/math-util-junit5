/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saintaphu.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    public static long getFatorial(int n){
        if(n<0 ||n>20){
            throw new IllegalArgumentException("n must between 0-20");
        }
        if(n==0 ||n==1){
            return 1;
        }
        return n*getFatorial(n-1);
    }
        
}
