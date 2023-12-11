    import java.util.Scanner;
    import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio1 {


    
/* adivinar palabra entre una serie de ellas de 5 letras, teniendo 6 intentos.
 * Pistas:
 * Separar la palabra escogida en un array de char.
 * Comparar la palabra introducida por el usuario, e indicar si las palabras estan en la palabra a adivinar.
 * Se hace mediante un while que para que haga las comparaciones mientras el numero de intentos sea menor o igual que 6
 * Las comparaciones se hacen con un if que devuelve si hemos acertado o si no hemos acertado
 */


    public static void main(String[] args) {
        
        juegoletras();

    }

    public static void juegoletras() {
        Scanner scan = new Scanner (System.in);
        /*Array con las posibles palabras */
        String [] palabra = {"barco","plato","cedro","libro","torta","ficha","letra","dagas","grito","hielo"};
        /*Uso la funcion "aleatorio" para escoger la palabra */
        int indice = aleatorio(0, palabra.length - 1);
        /*asignamos a palabra_buscada la palabra aleatoria */
        String palabra_buscada = palabra[indice];
        /*transformamos la palabra seleccionada a un array tipo char */
        char [] palabradescompuesta = palabra_buscada.toCharArray();
        /*Establezco la variable contador para llevar cuenta de los intentos */
        int contador=6;
        String palabrausuario="";

        System.out.println("Adivina la palabra de 5 LETRAS que estoy pensando, la palabra empieza por la letra: " + palabradescompuesta[0]);
        System.out.println("Tienes " + contador + " intentos, si no logras acertar se acabara el juego, recuerda INTRODUCE UNA PALABRA DE 5 LETRAS O EL JUEGO FALLARA!!!");
        System.out.println("Dime, ¿cual crees que puede ser?");
        
        /*Empiezo este while para comprobar si la palabra que buscamos es la correcta y  para comprobar si tenemos intentos */
        while (!palabrausuario.equals(palabra_buscada) && (contador > 0)) {
        palabrausuario = scan.nextLine();

        /*Este if me asegura que la palabra introducida tiene 5 letras, de lo contrario el programa fallaria */
            if (palabrausuario.length() != 5) {
                System.out.println("La palabra tiene que tener 5 letras");
                continue;
            } else if (palabrausuario.equals(palabra_buscada)){
                continue;
            }
        
        contador--;
        ayuda_adivinanza(palabrausuario,palabra_buscada);
        System.out.println("Váya, esa no era la palabra");
        System.out.println("Te quedan " + contador + " intentos.");
        System.out.println("Dime, ¿cual crees que puede ser?");

        
        }
        if (contador== 0){
            System.out.println("Te has quedado sin intentos, Vuelve a intentarlo!!");
        } else{
            System.out.println("ENHORABUENA, HAS ACERTADO!!!!");
            System.out.println("La palabra era " + palabra_buscada);
        }
    }
    /*Usamos la funcion ThreadLocalRandom para escoger un numero aleatorio que se usara en el indice del array para seleccionar una de las palabras */
    public static int aleatorio( int min,int max ) {
        
        return ThreadLocalRandom.current().nextInt(min ,max + 1);
    }

    /*Esta funcion, es la que comprueba si hay coincidencias entre la palabra que hemos introducido y la palabra que estamos buscando en la misma posicion y nos dara
     * como resultado las pistas dependiendo de cuantas palabras coincidan.
     */
    public static void ayuda_adivinanza(String palabrausuario, String palabrabuscada) {
        char [] buscadadescompuesto = palabrabuscada.toCharArray(); 
        char [] usuariodescompuesto = palabrausuario.toCharArray();
        char [] ayuda = new char[buscadadescompuesto.length];
        
        for (int i = 0; i < buscadadescompuesto.length; i++) {
            if (buscadadescompuesto[i] == usuariodescompuesto[i]) {
                ayuda[i] = usuariodescompuesto[i];
            } else {
                ayuda[i] = '_';
            }
        }

        for (int i = 0; i < buscadadescompuesto.length; i++) {
            if (ayuda[i] != '_') {
                System.out.println("Esta letra forma parte de la palabra: " + ayuda[i]);
            }
        }

    }
}