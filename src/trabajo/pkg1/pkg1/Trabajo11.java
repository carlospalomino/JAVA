
package trabajo.pkg1.pkg1;
import java.util.Scanner;
 

public class Trabajo11 {

    
    
  public static void main(String[] args) {
         Scanner entrada = new Scanner ( System.in);
         int a,h,n;
        
        System.out.println("ingrese el valor de la base y altura");
        a = entrada.nextInt();
        h = entrada.nextInt();
        
        n = (a * h)/2;
        System.out.println("el area del triangulo es: "+n);
    }
    }
    
