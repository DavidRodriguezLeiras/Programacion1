import java.util.Scanner;
public class Ejercicio6 {
    /* Implementa unha sentencia switch que escriba unha mensaxe en cada caso.
     * Inclúea nun bucle de proba for. Utiliza tamén un break tras cada caso e próbao. 
     * Elimina o break e observa que ocorre.
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Dime que caso quieres , del 1 al 4");
    
    int caso = scan.nextInt();
    scan.close();
    
        switch (caso) {
            case 1:
            System.out.println("Este es el caso " + caso);
            break;

            case 2:
            System.out.println("Este es el caso " + caso);
            break;

            case 3:
            System.out.println("Este es el caso " + caso);
            break;

            case 4:
            System.out.println("Este es el caso " + caso);
            break;

        }


    }
    
}
