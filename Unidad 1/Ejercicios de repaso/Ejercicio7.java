import java.util.Scanner;
public class Ejercicio7 {
/* Escribe un programa que calcule a media de tres notas para cada alumnos e finalmente amose a media total.
 * Introduce por teclado o número de alumnos e as notas de cada un deles.
 */
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Cuantos alumnos hay?");
        int n_alumnos = scan.nextInt();
        
        double[][] notas = new double [n_alumnos][3];
        String [] alumno = new String[n_alumnos];
        double[] media = new double[n_alumnos];
        double mediatotal = 0;

        for (int i = 0 ; i< n_alumnos;i++){
            //Guardamos el nombre del alumno en el array alumno[]
            System.out.println("Dime el nombre del alumno " +(i+1));
            scan.nextLine();
            alumno[i] = scan.nextLine();
            //Guardamos cada una de las notas del alunmo en el array notas[][]
            System.out.println("Dime la primera nota: ");
            notas[i][0] = scan.nextInt();
            System.out.println("Dime la segunda nota: ");
            notas[i][1] = scan.nextInt();
            System.out.println("Dime la tercera nota: ");
            notas[i][2] = scan.nextInt();
        }

        // Aqui calculamos la media de las notas de cada alumno y mostramos la media de cada alumno con su nombre
        for (int j = 0 ; j<n_alumnos;j++){
            media[j]=  calculomedia(notas[j],n_alumnos);
            System.out.println("La media de " + alumno[j] + " es " + media[j]);
        }
        
        //Calculamos la media total de todas las medias
        mediatotal = calculomedia(media,n_alumnos);
        
        System.out.println("La media total de todos los alumnos es " + mediatotal);
        scan.close();
    }
        //Funcion para calcular la media , en base a un array y un numero entero (n_alumnos)
    static double calculomedia(double[] a , int u){
        double mediatotal = 0;
        for (int i=0;i< a.length;i++){
        mediatotal=mediatotal+a[i];
        }
        mediatotal = mediatotal/u;
        return mediatotal;
    }
}
