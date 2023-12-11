
import java.util.Scanner;

public class Ejemploarraybasico {
    /*leer 10 numeros por teclado, almacenarlo en un array y al finalizar sacarlo por pantalla , el maximo y el minimo
     * y en que posicion estan almacenados
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int [] ejemplo = new int[10];
        int maximo= ejemplo[0];
        int minimo= ejemplo[0];
        int posmin= 0;
        int posmax= 0;

        for (int i=0 ; i < ejemplo.length ; i++) {
            System.out.println("Dime un numero: ");
            int a = scan.nextInt();
            ejemplo[i] = a;
            
        }

        for (int i=0 ; i < ejemplo.length ; i++) {
            if (ejemplo[i] > maximo){
                maximo = ejemplo[i];
                posmax = i;
            } else {
            }
            if (ejemplo[i] < minimo){
                minimo = ejemplo[i];
                posmin = i;
            }
            System.out.println("El numero en posicion "+ i + " es " + ejemplo[i]);
            
        }
        System.out.println("El numero minimo es el " + minimo + " esta en la posicion " + posmin );
        System.out.println("El numero máximo es el " + maximo + " esta en la posicion " + posmax );
    }
}