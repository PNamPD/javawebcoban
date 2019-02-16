/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_5;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai5 {
    public static float bai5_1(int n){
        if(n<=1){
            return 1;
        }
        else return 1/(float)(n) + bai5_1(n-1); 
    }
    public static int bai5_2(int n){
        if(n<=1){
            return 1;
        }
        else return n+ bai5_2(n-1);
    }
    public static double bai5_3(int n){
        int tong=0;
        for(int i=1;i<=n;i++){
            tong+=Math.pow(i, 2);
        }
        return tong;
    }
    public static float bai5_4(int n) {
        if(n<=1){
            return (float) (0.5);
        }
        else return (1/(float)(2*n)) + (bai5_4(n-1));
    }
    public static float bai5_5(int n) {
        if(n<=0){
            return 1;
        }
        else return (1/((float)(2*n)+1)) + bai5_5(n-1);
    }
    public static float bai5_6(int n) {
        if(n<=1){
            return (float)(0.5);
        }
        else return (1/(float)(n*(n+1))) + bai5_6(n-1);
    }
    public static float bai5_7(int n){
        float tong=0;
        for(int i=0;i<=n;i++){
            tong+=(2*i+1)/(float)(2*i+2);           
        }
        return tong;
    }
    public static int giaiThua(int n){
        if(n==1){
            return 1;
        }
        else return n*(giaiThua(n-1));
    }
    public static int bai5_8(int n) {
/*        int tong=0;
        for(int i=1;i<=n;i++){
            tong+=giaiThua(i);
        }
        return tong; */
        if(n==1){
            return 1;
        }
        else return giaiThua(n) + bai5_8(n-1);
    }
    public static double bai5_9(int n,int x) {
        int tong=0;
        for(int i=1;i<=n;i++){
            tong+=pow(x,i);
        }
        return tong;
    }
    public static double bai5_10(int n,int x) {
        int tong=0;
        for(int i=1;i<=n;i++){
            tong+=pow(x,2*i);
        }
        return tong;
    }
    public static double bai5_11(int n,int x) {
        int tong=0;
        for(int i=1;i<=n;i++){
            tong+=pow(x,2*i+1);
        }
        return tong;
    }
    public static float Mau(int n){
        if(n==1){
            return 1;
        }
        else return n+ Mau(n-1);
    }
    public static float bai5_12(int n) {
        float tong=0;
        for(int i=1;i<=n;i++){
            tong+=1/(float)(Mau(i));
        }
        return tong;
    }
    public static void main(String[] args){
        Scanner bc= new Scanner(System.in);
        // tinh tong so nguyen 
        int n;
        System.out.print("Nhap vao n: ");
        n=bc.nextInt();
        System.out.println("Tong bai 5_1 la: "+bai5_1(n));
        System.out.println("Tong bai 5_2 la: "+bai5_2(n));
        System.out.println("Tong bai 5_3 la: "+bai5_3(n));
        System.out.println("Tong bai 5_4 la: "+bai5_4(n));
        System.out.println("Tong bai 5_5 la: "+bai5_5(n));
        System.out.println("Tong bai 5_6 la: "+bai5_6(n));
        System.out.println("Tong bai 5_7 la: "+bai5_7(n));
        System.out.println("Tong bai 5_8 la: "+Mau(n)+" va "+bai5_8(n));
        int x;
        System.out.print("Nhap vao x= ");
        x= bc.nextInt();
        System.out.println("Tong bai 5_9 la: "+bai5_9(n,x));
        System.out.println("Tong bai 5_10 la: "+bai5_10(n,x));
        System.out.println("Tong bai 5_11 la: "+bai5_11(n,x));
        System.out.println("Tong bai 5_12 la: "+bai5_12(n));
    }
}
