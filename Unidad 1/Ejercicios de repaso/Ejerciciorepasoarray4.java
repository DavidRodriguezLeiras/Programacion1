import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Ejerciciorepasoarray4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Array que contiene las palabras candidatas a ser adivinadas
        String[] palabras = {"barco","alumno","Mondongo","informatica","profesor","escuela","programador"};
        //asignamos el la palabra aleatoriamente del array a la variable palabra
        String palabra = palabras[palabraaleatoria(0, palabras.length)];
        //Creamos un char vacio con un numero de posiciones igual al tamaño maximo de la palabra escogida
        char[] palabraEscogida = new char[palabra.length()];
        //Creamos un array donde guardaremos cada una de las letras de la palabra escogida
        char[] palabraOculta;
        palabraOculta = palabra.toCharArray();
        //aqui guardaremos la letra introducida en cada iteracion
        char letra;
        //Condicion para indentificar si hemos adivinado la palabra totalmente

        
        for(int i = 0; i < palabraEscogida.length ;i++) {
            palabraEscogida[i] = '_';
        }

        for(int i = 0; i < palabraEscogida.length ; i++){
            System.out.print(palabraEscogida[i]+ " ");
        }
        System.out.println();
        do{
            System.out.println("Dame una letra:");
            letra = scan.nextLine().toCharArray() [0];

            comparar(palabraEscogida,palabraOculta,letra);
            
        } while (!acierto(palabraEscogida));
        scan.close();
    }
    
    //Metodo para escoger aleatoriamente la palabra del array
    public static int palabraaleatoria(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    //Metodo para comprobar si la letra introducida coincide con la palabra a adivinar, si es asi escribimos esa palabra en el array
    public static char[] comparar (char[] palabraEscogida , char[] palabraOculta , char letra) {
        for(int i = 0; i < palabraOculta.length ;i++) {
            if (letra == palabraOculta[i]){
                palabraEscogida[i]= letra;
            }
        }
        return palabraEscogida;
    }

    public static boolean acierto (char[] palabraEscogida) {
        boolean result = false;
        for(int i = 0; i<palabraEscogida.length;i++) {
            if(palabraEscogida[i] == '_') {
                result = false;
                break;
            } else {
                result =true;
            }

        }

        return result;
    }
    
}
