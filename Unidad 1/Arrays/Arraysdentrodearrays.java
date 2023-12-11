import java.util.Scanner;
public class Arraysdentrodearrays {

    public static void main(String[] args) { 
       Scanner scan = new Scanner(System.in);
       String pregunta = ""; 
       String[][] paises = {{"Espana","Ferrol","Lugo","A Coruña"}, {"Reino Unido","London","Bristol","Liverpool"}, {"Italia","Roma","Florencia","Venecia"}, {"Francia","Paris","Marsla","Lion"}, {"Portugal","Oporto","Braga","Lisboa"}}; 
       System.out.println("Que pais quieres ver las ciudades?");
       pregunta = scan.nextLine();
       //recorrerpaises(paises);
       //leerpaises(paises,pregunta); 
       scan.close();

    }

    public static void recorrerpaises(String[][]paises) {
         //Primero recorremos la primera posicion del array
         for(int i = 0; i < paises.length; i++) {
            // Despues recorremos la segunda posicion del array
            for(int j= 0; j < paises[i].length; j++) {
                // si solo queremos que se muestre la primera posicion de cada primera posicion
                if (j==0) {
                System.out.println("Pais [" +i+ "] [" +j+ "]= " +paises[i][j]);
                }
            }
        }   
    }
    
    //solicitar por teclado un pais, y si coincide con alguno, mostramos las ciudades
    public static void leerpaises(String[][]paises, String pregunta) {
         //Primero recorremos la primera posicion del array
         for(int i = 0; i < paises.length; i++) {
            // Despues recorremos la segunda posicion del array
            if (!paises[i][0].equalsIgnoreCase(pregunta)) {
                continue;
            }

            System.out.println("Ciudades:");

            for(int j= 0; j < paises[i].length; j++) {
                // 
                System.out.println(paises[i][j]);
            }
        }
    }

}
