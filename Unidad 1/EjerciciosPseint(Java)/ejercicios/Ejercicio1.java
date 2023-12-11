import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*Declaramos VARIABLES */
        String a = "";
        String b = "";
        String operacion = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Pedimos el primer numero");
        a = scan.nextLine();
        System.out.println("Pedimos el segundo numero");
        b = scan.nextLine();
        System.out.println("Que operacion quieres realizar , suma o resta?");
        operacion = scan.nextLine();
        System.out.println("El primer numero es " + a);
        System.out.println("El segundo numero es " + b);
        System.out.println("La operacion que quieres realizar es " + operacion);

    }
}