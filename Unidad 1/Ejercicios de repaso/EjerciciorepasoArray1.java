public class EjerciciorepasoArray1 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[arr1.length];

        //vamos a multiplicar cada valor del array por el indice de la posicion que ocupa
        /*
        for(int i = 0; i<arr1.length ;i++) {
            arr2[i] = arr1[i] * i;
        }
        */

         //Modificar este codigo para realizar las operaciones con While y do While
        int i=0;

        while (i < arr1.length) {
            arr2[i] = arr1[i] * i;
            i++;
        }
        
       
        do {
            arr2[i] = arr1[i] * i;
            i++;
        } while (i < arr1.length);
        

        //Ahora mostramos el nuevo array por pantalla
        for (int valor : arr2 ) {
            System.out.println(valor);
        }


    }
   
}
