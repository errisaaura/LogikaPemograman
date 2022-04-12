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
public class Soal3 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====MENJUMLAHKAN ANGKA=====");
        
        System.out.print("Masukkan angka : ");
        int angka = scanner.nextInt();
        
        int hasil = 0;
        
        for(int a=1; a<=angka; a++){
            hasil += a;
            System.out.print(a+"+");
            
        }
        System.out.print("="+hasil);
                
    }
    
    
}
