import java.util.Scanner;
public class Ejercicio2 {
    /* Escribe un programa en Java que convirta de euros a dólares. Recibirá un número decimal
     * correspondente á cantidade en euros e contestará coa cantidade correspondente en dólares.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double euro = 0;
        final double dolar = 1.094;
        
        
        System.out.println("Cuantos euros quieres convertir?");
        euro = scan.nextDouble();
        scan.close();

        System.out.println(euro + " euros son " +(euro*dolar)+ " dolares");
        

    }
}
