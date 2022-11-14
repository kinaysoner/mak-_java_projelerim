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
public class celcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("celcius değerini giriniz");
        int cel=input.nextInt();
        
        double fahren= (double)(cel*1.8)+32;
        System.out.println("Fahren Değeriniz "+fahren);
        
    }
    
}
