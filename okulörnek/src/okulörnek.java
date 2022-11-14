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

public class okulörnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bir N Sayısı Giriniz");
        int N = input.nextInt();
        int s = 1;
        int tektoplam = 0;
        int cifttoplam=0;

        while (s <= N) {
            if (s % 2 != 0) {
                tektoplam = tektoplam + s;

            }
            else {
            cifttoplam=cifttoplam+s;
            }
            
            s = s + 1;

        }
        System.out.println("cift toplam"+cifttoplam+"Toplam" + tektoplam);  

    }

}
