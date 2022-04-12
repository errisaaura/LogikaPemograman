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
        String[] buah = {"Durian","Apel", "Mangga", "Jeruk", "Pepaya"};
        int[] terjual = {10,10,20,30,40};
        
        int max = terjual[0];
        int temp =0;
        
        for(int i=0; i<terjual.length; i++){
            if(terjual[i] > max){
                max = terjual[i];
                temp=i;
            }
        }
        
        
        
    }
    
}
