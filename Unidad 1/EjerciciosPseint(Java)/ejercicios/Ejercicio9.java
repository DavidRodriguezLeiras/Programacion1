import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
      /*DEFINIMOS VARIABLES */
        int a;
        int b;
        int resultado;

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
                resultado = Operaciones.sumar(a,b);
                System.out.println("El resultado de la suma es " + resultado);
                break;

            case "restar":
                resultado = Operaciones.restar(a,b);
                System.out.println("El resultado de la resta es " + resultado);     
                break;

            case "multiplicar":
                resultado = Operaciones.multiplicar(a,b);
                System.out.println("El resultado de la multiplicacion es " + resultado);
                break;

            case "dividir":
                int[] resultados = Operaciones.dividir(a,b);
                int result = resultados[0];
                int resto = resultados[1];
                System.out.println("El resultado de la division es " + result);
                System.out.println("El resto de la division es " + resto);
                break;
        }                    

    }
}
