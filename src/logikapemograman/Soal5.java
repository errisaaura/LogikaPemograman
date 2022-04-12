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
        System.out.println("=====MENENTUKAN NILAI MAKSIMUM DALAm ARRAY=====");
        System.out.println("");
        System.out.println("Angka = [4,6,1,3,5]");
        
        int[] angka = {4,6,1,3,5};
        
        int maks = angka[0];
        
        
        for(int a =0; a<5; a++){
            if(angka[a] > maks){
                maks = angka[a];
                System.out.println("Nilai Maksimum dalam array adalah "+maks);
                
            }
        }
        
    }
}
