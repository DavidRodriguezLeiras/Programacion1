import java.util.Scanner;
public class TestExamen {
    //El programa debe buscar la primera ocurrencia de un elemento en el array

    /*  REQUISITOS
     * 
     *  -Solicitar el dni de un cliente
     *  -Implementar una funcion busca(string[][] datos, String dni)
     *  -nombre funcion: busca(datos,dni)
     *  -Tipo datos debe retornar la funcion: entero
     *  -La funcion debe retornar una variable "int indice"
     * 
     * 
     *  MEJORAS:
     *  Comprobar que el dni introducido tiene 8 caracteres
     *  Controlar en el caso de que no existan ocurrencias (esta comprobacion debe ir en la funcion) desde el metodo main enviaremos un mensaje informando de que no existe.
     * 
     * Mostrar por pantalla:
     * DATOS DEL CLIENTE
     * NOMBRE: nombre
     * Apellidos: apellido 1, apellido 2
     * dni: dni
     */
    public static void main(String[] args) {
        // Array que contiene nombre, Apellidos, dni de alumnos
        Scanner scan = new Scanner(System.in);
        String [][] datos = {{"Ramon","Fernandez","Lopez","33000111"},
                             {"Carmen","Lui","Perez","33000222"},
                             {"Sandra","Lema","Osir","33000333"},
                             {"Brais","German","Friol","33000444"},
                             {"Saul","Pereiro","Do Santos","33000555"}};
        String dni="";
        int indice=0;
        System.out.println("Dime el dni del cliente que deseas comprobar:");
        dni = scan.nextLine();
        indice = busca(datos,dni);
        scan.close();
        
        switch (indice) {
            case 6:
                System.out.println("El cliente no existe");
                break;

            case 7:
                System.out.println("El dni introducido no es valido");
                break;

            default:
            System.out.println("DATOS DEL CLIENTE");
            System.out.println("NOMBRE: "+datos[indice][0]);
            System.out.println("Apellidos: "+datos[indice][1]+", "+datos[indice][2]);
            System.out.println("DNI: "+datos[indice][3]);
            break;
        }
    }

    public static int busca(String [][] datos , String dni) {
        int indice=0;
        if (dni.length() == 8){
            for (int i = 0; i < datos.length;i++) {
                if (dni.equals(datos[i][3])) {
                    indice = i;
                    break;
                } else {
                    indice=6;
                }
            }
        } else{
            indice = 7;
        }
        return indice;
    }
}
