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
1- BAŞLA 
2- Kullanıcıdan kenar uzunlugu değerini istemek için ekrana mesaj yazdıran kodunu yaz ve sayıyı int ile tanımla.
3-Kullanıcıdan yukseklik değerini istemeke için ekrana mesaj yazdıran kodunu yaz ve sayıyı int ile tanımla 
4-Alanı bulmak için gereken formülün işlem ve tanımlamasını yap.
5-Yapılan işlemin sonucunu ekrana yazdıracak mesaj kodunu yaz 
6-BİTİR

*/

import java.util.Scanner;
public class ucgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Kenar Uzunlugu Giriniz");
        int kenar=input.nextInt();
        System.out.println("Yükseklik Giriniz");
        int yükseklik=input.nextInt();
        
        double sonuc= (double)(kenar*yükseklik)/2;
        System.out.println("Alanınız"+sonuc);
         
        
        
    }
    
}
