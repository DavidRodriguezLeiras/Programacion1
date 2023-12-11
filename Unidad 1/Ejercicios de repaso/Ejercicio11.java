
import java.util.Scanner;
public class Ejercicio11 {

    /*Escribe un programa que diga cal é a última cifra dun número enteiro introducido por teclado. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime el numero:");
        num= scan.nextInt();
        scan.close();
        char[] descomposicion = (num+"").toCharArray();
       
            System.out.println("El ultimo digito del nº introducido es "+ descomposicion[descomposicion.length-1]);
    }
    
}
