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
public class Soal5 {
    public static void main (String[] args){
        System.out.println("=====MENENTUKAN NILAI MAKSIMUM DALAM ARRAY=====");
        System.out.println("");
        System.out.println("Angka = [4,6,1,3,5]");
        
        int[] angka = {4,6,10,3,5};
        int k = angka.length;
        
        int maks = angka[0];
        
        
        for(int a =1; a<k; a++){
            if(angka[a] > maks){
                maks = angka[a];
//                System.out.println("Nilai Maksimum dalam array adalah "+maks);
                
            }
            System.out.println(maks);
        }
        
    }
}
