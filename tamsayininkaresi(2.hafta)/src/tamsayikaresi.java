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
public class tamsayikaresi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("N Sayısı girin");
        int toplam,N,A;
        N=input.nextInt();
        A=1;
        toplam=0;
        while (A<=N) {
            toplam=toplam+A*A;
            A=A+1;
        }
        System.out.println(toplam);
    }
    
}
