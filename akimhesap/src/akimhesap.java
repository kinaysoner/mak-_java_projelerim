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
2-Kullanıcının direnc değerini girmesi için gereken mesaj kodunu yaz.
3-Kullanıcının akım değerini girmesi için gereken mesaj kodunu yaz.
4-Hesaplanacak değerin formülünün kodunu yaz.
5-Kullanıcının sonucu görmesi için gereken mesaj kodunu yaz.
6-BİTİR
*/

import java.util.Scanner;
public class akimhesap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("İletkenin Direncini Giriniz");
        int direnc=input.nextInt();
        System.out.println("İletkenin Akımını Giriniz");
        int akim=input.nextInt();
         
        int voltaj=akim*direnc;
        System.out.println("Gerilim:"+voltaj);
        
        
       
    }
   
    
}
