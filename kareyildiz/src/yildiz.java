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
public class yildiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int row;
        do {
            System.out.println("Lütfen Satır Sayısı Giriniz");
            row=input.nextInt();
            
        }
        while(row<0 || row%2==0); 
        for (int i = 1; i<=row; i++) {
            if (i==1 || i==row) { // satır son veya ilk satır ise 
                for (int j = 1; j <= row; j++) { 
                    System.out.println("*");
                }
            }
            else {
                for (int j = 1; j <=row; j++) {
                    if (j==1 || j==row) { //ilk sutün veya son sutun ise 
                        System.out.println("*");
                    }
                    else { //diğer sütunlar ise 
                        System.out.println(" ");
                    }
                }
                System.out.println();//alt satıra geç
            }
        }
        
        
    }
    
}
