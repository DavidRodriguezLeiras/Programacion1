import java.util.Scanner;

public class Ejercicio6 {
     public static void main(String[] args) {
      /*DEFINIMOS VARIABLES */
        int a;
        int b;
        int sumar;
        int restar;
        int multiplicar=0;
        int dividir=0;
        int contador= 0;
        String operacion = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Pedimos el primer numero");
        a = scan.nextInt();
        System.out.println("Pedimos el segundo numero");
        b = scan.nextInt();
        scan.nextLine();

        System.out.println("Que operacion quieres realizar , suma o resta?");
        operacion = scan.nextLine();

        switch (operacion) {
       
            case "sumar":
            sumar = a + b;
            System.out.println("El resultado de la suma es " + sumar);
            break;

            case "restar":
            restar = a - b;
            System.out.println("El resultado de la resta es " + restar);     
            break;

            case "multiplicar":
            for (int counter = 1 ;counter <= b; counter++) {
                multiplicar=multiplicar+a;
            }   
            System.out.println("El resultado de la multiplicacion es " + multiplicar);
            break;

            case "dividir":
            dividir = a;
            while (dividir >= b) {
                dividir = dividir-b;
                contador = contador+1;
            }
            System.out.println("El resultado de la division es " + contador);
            break;
        }                    

    }
}
