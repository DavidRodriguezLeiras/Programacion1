import java.util.Scanner;


/*Escribe un programa que pinte unha pirámide co vértice apuntando hacia arriba.
 * Enche cun carácter introducido por teclado que poderá ser unha letra, un número ou un dos seguintes símbolos *, +, -, $, &.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int altura=0;
        String digito="";
        System.out.println("Que altura tendra la piramide?");
        altura = scan.nextInt();  
        scan.nextLine(); 
        System.out.println("Que simbolo quieres usar??");
        digito= scan.nextLine();
        
        Dibujarpiramide(altura,digito);
        scan.close();
    }  
    

    public static void Dibujarpiramide (int altura, String digito) {

        //primer ciclo i=0 es menor que altura= 10. se incrementa i en 1 con cada iteracion.
        for(int i= 0; i < altura ; i++) {
            
            /* a=0 es menor que altura que en este caso vale 10.
             * entonces a=0 es menor que 10-0(i)-1, entonces altura vale 9 se incrementa el valor de a en 1 con cada ciclo, por lo tanto
             * se escribiran 9 espacios en blanco, en la segunda iteracion seran 8 , en la tercera 7 y asi hasta 0. */
            for (int a=0; a < altura  -i -1 ; a++){
                 System.out.print(" ");          
             }

             /* En la primera iteracion i vale 0, por lo tanto no se cumple la condicion asi que no se dibuja nada.
              * En la segunda iteracion k=1 , entonces k es menor que 2*1-1 por lo tanto solo se hace una iteracion dibujando un digito.
              * En la tercera iteracion k=2 , entonces k es menor que 2*2-1= 3 por lo tanto dibujara 2 digitos en 2 iteraciones , 
                hasta que (k) valga 4 */
            for (int k=0 ; k < 2 * i -1 ;k++){
                System.out.print(digito);
             }
            //Se hace el salto de linea antes del siguiente bucle, de esta manera se dibujara el siguiente nivel.
             System.out.println();
           
            }


    }

}