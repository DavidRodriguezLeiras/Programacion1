import java.util.Scanner;

public class Ejercicio3 {
    /* Escribe un programa en java que pida dous números do teclado e diga cal é o maior e cal o menor. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=0;
        int num2=0;

        System.out.println("Dame un numero: ");
        num1 = scan.nextInt();
        System.out.println("Dame otro numero: ");
        num2 = scan.nextInt();
        scan.close();

        if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
            System.out.println(num2 + " es mayor que " + num1);
        } else{
            System.out.println(num2 + " es menor que " + num1);
            System.out.println(num1 + " es mayor que " + num2);
        }
    }
}
