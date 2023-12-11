import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*DEFINIMOS VARIABLES */
        int a;
        int b;
        int sumar;
        int restar;
        int multiplicar;
        int dividir;
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

            } else if (operacion.equals("resta") ){
                restar = a - b;
                System.out.println("El resultado de la resta es " + restar);     

                    } else if (operacion.equals("multiplicar")) {
                        multiplicar = a * b;
                        System.out.println("El resultado de la multiplicacion es " + multiplicar);

                        } else if (operacion.equals("dividir")) {
                            dividir = a / b;
                            System.out.println("El resultado de la division es " + dividir);
                        } else {

                        }

    }
    
}

