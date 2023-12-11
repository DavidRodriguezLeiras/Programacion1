public class Operaciones {

    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        int multiplicar=0;
        if (b < a) {
            for (int counter = 1 ;counter <= b; counter++) {
                multiplicar=multiplicar+a;
                }   
            int resultado = multiplicar;
            return resultado; 
        } else {
            for (int counter = 1 ;counter <= a; counter++) {
                 multiplicar=multiplicar+b;
                 }   
            int resultado = multiplicar;
            return resultado;
            }     
    }

    public static int[] dividir(int a, int b) {
        int dividir = 0;
        int contador = 0;
        if (a > b) {
            dividir = a;
            while (dividir >= b) {
                dividir = dividir-b;
                contador = contador+1;
                }
            if (dividir != 0){
                int[] resultados = {contador, dividir};
                return resultados;

            } else {
                int[] resultados = {contador,0};
                return resultados;
            }
        } else {
            dividir = b;
            while (dividir >= a) {
                dividir = dividir-a;
                contador = contador+1;
            }
            if (dividir != 0){
                int[] resultados = {contador, dividir};
                return resultados;
            } else {
                int[] resultados = {contador,0};
                return resultados;
            }
        }
    }

}