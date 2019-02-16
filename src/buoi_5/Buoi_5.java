/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Buoi_5 {

    /**
     * @param args the command line arguments
     */
    // ba1
    public static void main(String[] args) {
        // giai phuong trinh bac 2 voi a,b,c la cac so thuc
        float a,b,c;
        float delta;
        float x1,x2;
        System.out.print("Nhap vao a= ");
        Scanner bc= new Scanner(System.in);
        a= bc.nextFloat();
        System.out.print("Nhap vao b= ");
        b= bc.nextFloat();
        System.out.print("Nhap vao c= ");
        c= bc.nextFloat();
        delta=b*b - (4*a*c);
        if(a==0){
            System.out.print("Phuong trinh co nghiem la: "+(-c/b));
        }
        else if(delta<0){
            System.out.println("Phuong trinh vo nghiem!");
        }
        else if(delta==0){
            System.out.print("Phuong trin co 2 nghiem kep: "+(-b/(2*a)));
        }
        else{
            x1=(-b+(float)sqrt(delta))/(2*a);
            x2=(-b-(float)sqrt(delta))/(2*a);
            System.out.print("Phuong trinh co nghiem x1= "+x1+" va x2= "+x2+"");
        } 
    }
    
}
