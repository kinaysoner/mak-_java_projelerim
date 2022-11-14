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
for(başlangıç değeri; koşul; arttırım)
*/
import java.util.Scanner;
public class fordöngüsü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("bir Değer Girin");
        int N=input.nextInt();
        int fakt=1;
        
        for(int s=1; s<=N; s++) {
        fakt*=s;
        
        }
        
        System.out.println(fakt);
    }
    
}
