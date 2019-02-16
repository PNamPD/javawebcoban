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

public class Bai6 {
    public static float bai6_1(int a,int b) {
        int max=0;
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        else{
            for(int i=1;i<=a;i++){
                if(b%i==0 && a%i==0){
                    max=i;
                }
            }
        }
        return max;
    }
    public static int bai6_2(int a,int b){
        int bcnn=1;
        for(int i=1;;i++){
            if(i%a==0 && i%b==0){
                bcnn=i;
                break;
            }
        }
        return bcnn;
    }    
        
    public static void main(String[] args) {
        Scanner bc = new Scanner(System.in);
        int a,b;
        // tim uoc chung lon nhat
        do{
            System.out.print("Nhap vao a= ");
            a=bc.nextInt();
            if(a<0){
                System.out.println("Vui long nhap lai");
            }
        }while(a<0);
        do{
            System.out.print("Nhap vao b= ");
            b=bc.nextInt();
            if(b<0){
                System.out.println("Vui long nhap lai");
            }
        }while(b<0);
        
        System.out.println("UCLN cua 2 so "+a+" va "+b+" la "+bai6_1(a,b));
        System.out.println("BCNN cua 2 so "+a+" va "+b+" la "+bai6_2(a,b));
    }
}
