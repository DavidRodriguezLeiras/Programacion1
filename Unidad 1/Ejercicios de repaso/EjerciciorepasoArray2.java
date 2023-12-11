import java.util.Scanner;
public class EjerciciorepasoArray2 {
//hacer un programa que pida el tamaño de un array al usuario y despues con un bucle 
   //crear un array de strings con ese tamaño y ese array debe guardar valores con el siguiente patron
   //0
   //01
   //0123
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Que tamaño tiene el array?");
        int num = scan.nextInt();
        scan.close();
        //Array donde guardaremos los valores
        String[] cadena = new String[num];
        //Hacemos un contador para poder almacenar los valores conforme vayamos iterando
        String counter = "";

        for (int i = 0 ; i< num ; i++) {
            counter = (counter+" "+ i);          
            cadena[i]= counter;
        }

        //Leemos el array de manera invertida
        for (int i=cadena.length-1; i >0 ; i--) {
            System.out.println(cadena[i]);
        }
        

    }
    
}
