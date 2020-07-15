
package atv.pkgfinal.tp;

import java.util.Scanner;


public class ATVFINALTP {
    public static void main(String[] args) throws InterruptedException {
     
        Menu objMenu = new Menu();
        objMenu.listaMenu();
        
        Scanner objScanner = new Scanner(System.in);
        int opc = objScanner.nextInt();
        
        objMenu.opcMenu(opc);
        
      
    }
    
}
