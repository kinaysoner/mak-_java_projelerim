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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("ilk sayıyı girin");
       int a=input.nextInt();
       System.out.println("ikinci sayıyı girin");
       int b=input.nextInt();
       System.out.println("ücüncü sayıyı girin");
       int c =input.nextInt();
       
       int toplam=a+b+c;
       System.out.println("Toplam Sonucunuz"+toplam);
       int carpim=a*b*c;
       System.out.println("carpım sonucunuz"+carpim);
       double ort=(double) toplam/3;
       System.out.println("Ortalamanız"+ort);
       
       
       
       

       
       
       
        
    }
    
}
