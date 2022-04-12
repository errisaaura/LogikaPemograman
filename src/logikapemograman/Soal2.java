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
public class Soal2 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("=====MENENTUKAN ANGKA GANJIL ATAU GENAP=====");
        
        System.out.print("Masukkan angka : ");
        int angka = scanner.nextInt();
        
        if(angka % 2 == 0 ){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        
        
    }
        
    }
    
}
