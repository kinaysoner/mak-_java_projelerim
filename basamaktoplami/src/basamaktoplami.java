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
public class basamaktoplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı Gir");
        int a =input.nextInt();
        int toplam=0;
        int kalan;
        while (a>0){
        kalan=a%10;
        toplam=toplam+kalan;
        a=a/10;
        }
      
        System.out.println(toplam);
       
        
    }
       
}
