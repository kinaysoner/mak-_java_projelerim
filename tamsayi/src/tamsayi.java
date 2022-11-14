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

public class tamsayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("Sayı Pozitiftir");
        } else if (a < 0) {
            System.out.println("Sayı Negatiftir.");
        }
        else {
            System.out.println("0 a eşit");
    }
    }

}
