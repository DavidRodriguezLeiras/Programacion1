import java.util.Scanner;

public class Ejercicio8 {
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
                if (b < a) {
                    for (int counter = 1 ;counter <= b; counter++) {
                        multiplicar=multiplicar+a;
                    }   
                    System.out.println("El resultado de la multiplicacion es " + multiplicar);
                } else {
                    for (int counter = 1 ;counter <= a; counter++) {
                        multiplicar=multiplicar+b;
                    }   
                    System.out.println("El resultado de la multiplicacion es " + multiplicar);
                }
                break;

            case "dividir":
                if (a > b) {
                    dividir = a;
                    while (dividir >= b) {
                        dividir = dividir-b;
                        contador = contador+1;
                    }
                    if (dividir != 0){
                        System.out.println("El resultado de la division es " + contador);
                        System.out.println("El resto es " + dividir);
                    } else {
                        System.out.println("El resultado de la division es " + contador);
                    }
                } else {
                    dividir = b;
                    while (dividir >= a) {
                        dividir = dividir-a;
                        contador = contador+1;
                    }
                    if (dividir != 0){
                        System.out.println("El resultado de la division es " + contador);
                        System.out.println("El resto es " + dividir);
                    } else {
                        System.out.println("El resultado de la division es " + contador);
                    }
                }
                break;
        }                    

    }
}
