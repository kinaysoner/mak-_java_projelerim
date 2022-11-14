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
LOOP İNTSENSE MANTIGI 
ALGORİTMA MANTIĞI 
SINAV SORUSU ÖRNEĞİ OLABİLİR DİKKAT 
*/
import java.util.Scanner;
public class soruörnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//SINAV KAGIDA KESİN YAZZZZZZZZZ.
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int max=99;
        int min=1;
        int randomsayi=(int)(Math.random()*(max-min-1)+min);
        
        int deneme=0;
        while (true) {
            System.out.println("Lütfen 1-99 arası sayı giriniz");
            int sayi=input.nextInt();
            deneme++;
            if (sayi>randomsayi) {
                System.out.println("Daha kücük sayı giriniz");
            }
            else if (randomsayi>sayi) {
                System.out.println("Lütfen daha büyük bir sayı giriniz");
            }
            else if (randomsayi==sayi){
                System.out.println("Tebrikler Doğru Tahmin");
                break; //döngüden cıkar
           }
            
        }
        System.out.println(deneme+ "tahminde bildiniz");
     
       
        
       
      
        
        
    }
    
}
