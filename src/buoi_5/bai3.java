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
public class bai3 {
    // 
    public static void main(String[] args){
        // kiem tra so nguyen to
        int n;
        System.out.print("Nhap vao n= ");
        Scanner bc= new Scanner (System.in);
        n=bc.nextInt();
        if(n<=1){
            System.out.println("Khong phai so nguyen to!");
        }
        else{
            for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Khong phai so nguyen to!");
                break;
            }
            else
                System.out.println("Day la So nguyen to !");
            }
        }
        
        if(KtSoNguyenTo(n)==true){
            System.out.println("Day la So nguyen to !");
        }
        else System.out.println("Khong phai so nguyen to!");
        System.out.println();
        int bien=2,k,dem=0;
        System.out.print("Ban co bao nhieu so nguyen to: ");
        k=bc.nextInt();
        System.out.println("-- "+k+" so nguyen so la: ");
        while(dem<=k){
            if(KtSoNguyenTo(bien)==true){
                System.out.print(" "+bien);
                dem++;
                bien++;
            }
            else{
                bien++;
            }
        }
    }
    public static boolean KtSoNguyenTo(int n){
        if(n<=1){
            return false;
            
        }
        else{
            int k=(int)Math.sqrt(n);
        for(int i=2;i<=k;i++){
            if(n%i==0){
                return false; 
                
            }
        }
        return true;
    }
    }
}
