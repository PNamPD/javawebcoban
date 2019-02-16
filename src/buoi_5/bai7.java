/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai7 {
    // day fibonaci
    
    public static void main(String[] args) {
        Scanner bc= new Scanner(System.in);
        int n,i=0,f1=0,f2=1,f3=0;
        System.out.print("Nhap n= ");
        n= bc.nextInt();
        System.out.println("Day fibonaci: ");
        while(i<=n){
            f3=f1+f2;
                 System.out.print(" "+f3);
                 f1=f2;
                 f2=f3;
            i++;
        }
        
    }
}
