import java.util.Scanner;

/*Escribe un programa en Java que lea un número enteiro por teclado e imprima todos os números impares menores que él.*/
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Dame 1 numero: ");
        num1= scan.nextInt();
        scan.nextLine();
        scan.close();
        

        for (int i = num1; i > 0 ; i--) {
            if (i % 2 == 0) {
            } else {
                System.out.println(i);
            }
        }
        
    }
}
