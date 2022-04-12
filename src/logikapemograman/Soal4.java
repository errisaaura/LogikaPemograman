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
public class Soal4 {
    public static void main(String[] args){
        System.out.println("=====MENENTUKAN ANGKA GANJIL ATAU GENAP DALAM ARRAY=====");
        System.out.println("");
        System.out.println("Angka = [4,6,1,3,5]");
        
        int[] angka = {4,6,1,3,5};
        
        System.out.print("-> [");
        for(int a =0; a<5; a++){
            if(angka[a] % 2 == 0){
                System.out.print("Genap,");
            }else{
                System.out.print("Ganjil,");
            }
        }
        System.out.println("]");
        
        
        
        
    }
}
