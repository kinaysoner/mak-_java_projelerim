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
1-BAŞLA
2-Kullanıcıdan acı girmesi için değer iste
3-Kullanıcının girdiği değeri radyana ve grad çevirecek formülleri yaz ve tanımla.
4-Kullanıcının radyan ve grad değerini görebileceği mesaj kodunu yaz.
5-BİTİR
*/
import java.util.Scanner;
public class aciradyan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
       System.out.println("Dönüştürülmesini istediğiniz açıyı yazınız ");
       int aci=input.nextInt();
       double pi=3.14;
       double sonuc=(double)(aci*pi)/180;
       double grad=aci*(10/9);
       
       System.out.println("Açınızın Radyan ve Grad Eşiti"+sonuc);
       
       
       
       
        
    }
    
}
