
package Ecuacion;
import java.util.Scanner;

public class EcuacionMain {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el valor de 'a':\t");
        int n1 = s.nextInt();
        System.out.print("Ingrese el valor de 'b':\t");
        int n2 = s.nextInt();
        System.out.print("Ingrese el valor de 'c':\t");
        int n3 = s.nextInt();
        
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(n1, n2, n3);
        
        
        System.out.println("El resultado es: \n");
        if(ecuacion.TieneRaicesReales()){
            System.out.println("Raiz 1: " + ecuacion.VerRaiz1());
            System.out.println("Raiz 2: " + ecuacion.VerRaiz2());
        } else {
            System.out.println("Parte real: " + ecuacion.VerParteReal());
            System.out.println("Parte imaginaria: " + ecuacion.VerParteImaginaria());            
        }        
    }   
}
