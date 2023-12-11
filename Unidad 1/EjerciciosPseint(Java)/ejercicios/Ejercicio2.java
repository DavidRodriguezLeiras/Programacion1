import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*DEFINIMOS VARIABLES */
        int a;
        int b;
        int sumar;
        String operacion = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Pedimos el primer numero");
        a = scan.nextInt();
        System.out.println("Pedimos el segundo numero");
        b = scan.nextInt();
        scan.nextLine();

        System.out.println("Que operacion quieres realizar , suma o resta?");
        operacion = scan.nextLine();

        if (operacion.equals("suma") ) {
            sumar = a + b;
            System.out.println("El resultado de la suma es " + sumar);        
        }  else {

        }
    }
    
}
