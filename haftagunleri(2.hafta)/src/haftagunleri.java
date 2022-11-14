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
public class haftagunleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int a=input.nextInt();
        
        if(a==1){
        System.out.println("Pazartesi");
        }
        else if (a==2){
        System.out.println("Salı");
        }
         else if (a==3){
        System.out.println("Çarşamba");
        }
         else if (a==4){
        System.out.println("Perşembe");
        }
         else if (a==5){
        System.out.println("Cuma");
        }
         else if (a==6){
        System.out.println("Cumartesi");
        }
         else if (a==7){
        System.out.println("Pazar");
        }
        
    }
    
}
