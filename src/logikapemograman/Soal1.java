/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logikapemograman;
import java.util.Scanner;

/**
 *
 * @author erisa
 */
public class Soal1 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Angka ke-1 = ");
        int a = scanner.nextInt();
        
        System.out.println("=====MENCARI ANGKA YANG PALING BESAR=====");
        System.out.print("Angka ke-2 = ");
        int b = scanner.nextInt();
        
        if(a>b){
            System.out.println("Angka yang paling besar = "+ a);
        }else if(a<b){
            System.out.println("Angka yang paling besar = " +b);
        }else if(a==b){
            System.out.println("Kedua angka memiliki nilai yang sama");
        }
        
    }
    
}
