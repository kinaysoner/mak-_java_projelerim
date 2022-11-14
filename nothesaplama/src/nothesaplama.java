/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONER
 */
/*
1-BAŞLA 
2-Kullanıcının vize notunu girmesi için gereken kodu yaz.
3-Kullanıcının final notunu girmesi için gereken kodu yaz.
4-Yapılacak işlem için gereken kodu yaz.
5-Kullanıcının sonucu görmesi için gereken kodu yaz.
6-BİTİR
*/

import java.util.Scanner;
public class nothesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code 0application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Vize Notunuzu Giriniz");
        int vize=input.nextInt();
        System.out.println("Final Notunuzu Giriniz");
        int finall =input.nextInt();
        
        double sonuc=(double) (vize+finall)/2;
        
       System.out.println("Ortalamanız"+sonuc);
        
       
        
    }
    
}
