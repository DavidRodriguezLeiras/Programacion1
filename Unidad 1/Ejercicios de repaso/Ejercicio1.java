import java.util.Scanner;
/* Escribe un programa en Java que lea un número enteiro dende teclado e realice a suma dos 100 números seguintes,
 * amosando o resultado en pantalla.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int num =0;
    int suma=0;
    System.out.println("Dame un numero: ");
    num= scan.nextInt();
    scan.close();
    /*si pongo 10, counter valdra 10, entonces counter sera menor a num(10+100=110), hasta que counter no valga 110 se sumara 1 a counter
     * es decir, la operacion dentro del bucle se repetira 100 veces
     */
    for (int counter=num; counter < (num+100) ; counter++ ){
        /*suma vale 0 , con cada iteracion a suma se le sumara el valor de counter + 1 , es decir, en la primera iteracion sera 0+10+1
         * en la segunda sera 11+11+1=23, en la siguiente sera 23+12+1=36 y sucesivamente
         */
        suma = suma +(counter+1);
        
    }
        
System.out.println("El resultado es: " + suma);

    }
}