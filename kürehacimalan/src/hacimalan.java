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
2-Kullacının capı girmesi için gereken kodu yaz.
3-Formülde gereken pi değerini tanımla.
4-Yapılacak işlemin kodunu yaz.
5-Yapılan işlemin sonucunu kullanıcıya gösteren mesaj kodunu yaz.
6-BİTİR
*/

import java.util.Scanner;
public class hacimalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Çapı Giriniz");
        
        int cap=input.nextInt(); 
        double pi=3.14;
        double hacim= (double) 4*pi*(cap*cap*cap)/3;
         System.out.println("Hacim"+hacim);
         double alan= (double)4*pi*(2*cap);
         System.out.println("Alan"+alan);
         
         
         
        
         
        
       
        
        
      
       
    }
    
}
