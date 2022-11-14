/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONER
 */
import java.util.Scanner;
public class carpim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayı değeri girin");
        int ilk=input.nextInt();
        System.out.println("İkinci Sayıyı Girin");
        int ikinci = input.nextInt();
        int toplam = 0;
        
        while (0<ikinci){
        toplam=toplam+ilk;
        ikinci=ikinci-1;
        
        
            
        
        }
        
        System.out.println(toplam);
        
        
        
                
        
        
        
        
    }
    
}
