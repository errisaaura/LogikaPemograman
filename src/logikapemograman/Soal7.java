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
public class Soal7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array : ");
        int jumlah = scanner.nextInt();
        
        int[] arr;
        arr = new int[jumlah];
        
        System.out.println("Masukkan angka sesuai elemen yang sudah dimasukkan pada sebelumnya : ");
        for(int i=0; i<jumlah; i++){
            System.out.print("Angka ke-"+ (i+1)+"= ");
            arr[i] = scanner.nextInt();
        }
        
        int angka=arr[0];
        for(int a=0; a<arr.length; a++){
            if(arr.length == angka){
                System.out.println("ADA");
            }else if(arr.length != angka){
                System.out.println("TIDAK");
            }
                
            
        }

    }

    
}
