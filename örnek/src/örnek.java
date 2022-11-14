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
public class örnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
       System.out.println("Km Giriniz");
       int yol=input.nextInt();
       System.out.println("Dakikayı girin");
       int zaman=input.nextInt();
       double islem=(double) yol/zaman;
       System.out.println("Ortalama Hızınız" +islem);
       
    }
    
}
