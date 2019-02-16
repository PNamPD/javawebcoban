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
public class bai10 {   
    public static void main(String[] args) {
        // kiem tra xem ham co doi xung khong
        int n,du,temp=0,n1;
        Scanner bc= new Scanner(System.in);
        System.out.print("Nhap vao day so: ");
        n= bc.nextInt();
        n1=n;
        while(n>0){
            du=n%10;
            n=n/10;
            temp=temp*10+du;  
        }
        if(temp==n1){
            System.out.println("SO nay doi xung!");
        }
        else{
            System.out.println("Khong doi xung!");
        }
    }
}
