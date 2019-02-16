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
public class bai2 {
    // tinh giai thua so nguyen duong
    // de quy
    public static int GiaiThua(int n){
        if(n<1){
            return 1;
        }
        else{
            return n*GiaiThua(n-1);
        }
    }
    public static void main(String[] agrs){
        int giaiThua=1;
        int n;
        System.out.print("Nhap vao n= ");
        Scanner bc= new Scanner(System.in);
        n= bc.nextInt();
        System.out.println("Giai thua so nguyen "+n+" bang "+GiaiThua(n));
        if(n<1){
            System.out.println("Giai thua bang 1!");
        }
        else{
            while(n!=0){
            giaiThua=giaiThua*n;
            n--;
        }
        System.out.println("Giai thua so nguyen bang "+giaiThua);
        }
       
    }
}
