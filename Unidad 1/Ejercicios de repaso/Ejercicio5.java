import java.util.Scanner;

/* Escribe un programa que lea  temeraturas expresadas en graos Fahrenheit e as convirta a graos Ceslius amosándoas.
 * O programa finalizará cando lea un valor de temperatura igual ou superior a 999. 
 * A conversión de graos Farenheit (F) a Celsius© está dada por C=(F-32)*5/9 */


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int farenheit=0;
        
        System.out.println("Que temperatura en Farenheit quieres convertir a Cº");

        farenheit= scan.nextInt();
        
        System.out.println("La conversion de " + farenheit+ " grados Farenheit es " + conversion(farenheit)+ " grados Celsius");
        scan.close();
    }

    public static int conversion(int a) {
        int celsius=0;
        celsius = (a-32)*5/9;
        return celsius;
    }
}
