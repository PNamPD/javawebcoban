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
// nhap vao cho den khi nhap = 0; in ra so lon nhat 
public class bai4 {
    public static void main(String[] args){
        Scanner bc= new Scanner(System.in);
        int n,du=1,max=0,min=0;
        while(du!=0){
            System.out.print("Nhap vao n= ");
            n=bc.nextInt();
            du=n%10;
            if(n>=max){
                max=n;
            }
            if(n<=min){
                min=n;
            }
        }
        System.out.println("Gia tri lon nhat khi nhap vao : "+max);
        System.out.println("Gia tri nho nhat khi nhap vao : "+min);
    }
}
