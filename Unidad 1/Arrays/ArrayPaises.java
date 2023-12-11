public class ArrayPaises {
    public static void main(String[] args) {
        String[] pais = {"España","Reino Unido","Italia","Francia","Portugal"};
        //recorrer el array de posicion mas alta a mas baja
        recorreralreves(pais);
        arrayforeach(pais);
    }
        //De esta manera recorremos el array al reves
    public static void recorreralreves(String pais[]) {
         //recorrer el array de posicion mas alta a mas baja
         for (int i = pais.length -1 ; i >= 0; i--){
            //if (i == 3) continue;
            System.out.println("Pais "+ i +" :"+ pais[i]);
            //if (i == 3 ) break;
        }
    } 
        /*Esta es otra manera de listar todos los paises */
    public static void arrayforeach(String pais[]) {
        for(String paises: pais) {
            System.out.println(paises);
        }
    }

}