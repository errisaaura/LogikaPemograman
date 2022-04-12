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
public class Soal6 {
    public static void main(String[] args){
      System.out.println("=====CEK PENJUMLAHAN 2 ANGKA DALAM ARRAY=====");
      
      
      String hasil = "";
      int k = 10;
      int arr[] = {4, 1, 8, 7, 4};//{6, -6, 2, 6, 1};
      int n = arr.length;
      
      System.out.println(n);
      
      for(int i = 0; i< n; i++){
          int secondArr[] = arr; 
          for(int j = 0; j < n-1; j++){
              if(arr[i] + secondArr[j] == k){
                  hasil = "BISA";
                  System.out.println(hasil);
                  break;
              }else{
                  hasil = "TIDAK BISA";
              }
          }
          
          if(hasil == "BISA"){
              break; //break the outer loop
          }else{
             System.out.println(hasil);
             break;
          }
      }
   }    
}
