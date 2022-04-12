/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logikapemograman;

/**
 *
 * @author erisa
 */
public class Soal8 {
    public static void main(String[] args){
        System.out.println("=====MENENTUKAN BARANG YANG LARIS TERJUAL=====");
        String[] buah = {"Durian","Apel", "Mangga", "Jeruk", "Pepaya"};
        int[] terjual = {67,10,20,300,40};
        
        int t = terjual.length;
        
        int max = terjual[0];
        
        for(int g=0; g<t; g++){
            if(terjual[g]>max){
                max = terjual[g];
                for (int i = 0; i < buah.length; i++) { 
                    for (int j = i + 1 ; j < terjual.length; j++) {
                        if (buah[i].equals(terjual[j])) {
                            System.out.println(max);
                             
                    
            } 
          }
        }
                            
            }
        }
        System.out.println(max);
        
        
//        for (int i = 0; i < buah.length; i++) { 
//            for (int j = i + 1 ; j < terjual.length; j++) {
//                if (buah[i].equals(terjual[j])) { 
//                    
//            } 
//          }
//        }
          
        
        
        
    }
    
}
