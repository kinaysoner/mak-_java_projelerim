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
public class bölme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("İlk sayı");
        int a=input.nextInt();
        System.out.println("İkinci Sayı");
        int b=input.nextInt();
        for (int i = a; i<=b; i++) {
            if (i%3==0 && i%4==0){
                System.out.println(i);
            
            }
        }
    }
    
}
