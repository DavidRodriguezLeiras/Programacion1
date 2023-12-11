import java.util.Scanner;
public class Escribiryleerarray {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int [] ejemplo = new int[10];

        for (int i=0 ; i < ejemplo.length ; i++) {
            System.out.println("Dime un numero: ");
            ejemplo[i] = scan.nextInt();
        }

        scan.close();
        /*de esta manera leemos el array desde la posicion mas alta [9] hasta la mas baja [0] */
        for (int i=ejemplo.length-1 ; i >= 0 ; --i) {
            System.out.println("El numero en posicion "+ i + " es " +ejemplo[i]);
        }
    }
}



