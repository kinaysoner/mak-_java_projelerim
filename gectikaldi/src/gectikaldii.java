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
public class gectikaldii {

    private static int a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Vİze Gir");
        int g=input.nextInt();
        System.out.println("Final Gir");
        int b =input.nextInt();
        double toplam=(double) (g+b)/2;
        if(toplam>=50){
        
            System.out.println("Geçtiniz:"+toplam);
        }
        else {
            System.out.println("Kaldınız:"+toplam);
    
    }
    }
    
}
