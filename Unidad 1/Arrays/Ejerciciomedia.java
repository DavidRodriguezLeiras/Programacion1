public class Ejerciciomedia {

    /*Tabla en la que tenemos:
        Antonio : 7,4,9
        Carlos : 6,8,3
        Lucia: 5,10,4
        Pedro: 7,9,8
        Sara: 3,10,10
      
        Guardar todos estos datos en un array
        Sacar por pantalla nombre de cada alumno, con la media de su nota.
        **no sabemos el nº de notas
        **utilizar como minimo 1 metodo para hacer el calculo de la media
        **en lugar de ser un proceso debe devolver valores
        **debemos imprimir un maximo de 2 decimales
     */
    public static void main(String[] args) {
        String[][] alumnos = {{"Antonio","7","4","9"},{"Carlos","6","8","3"},{"Lucia","5","10","4"},{"Pedro","7","9","8"},{"Sara","3","10","10"}};
        
    }

    public static double[] notasporalumno(String[][] alumnos) {

        for (String nombrealumno[]:alumnos) {
            for (int i=0;i < nombrealumno.length ; i++){
                int a = nombrealumno.length;
                double[] notas = new double[a-1];
                if(i>0){

                }
            }

        }

    }

   /* 
    public static void mediaporalumno(String [][] alumnos) {
        double[] notas = new double[3];
        for(String nombrealumno[]: alumnos) {

            notas[0] = Double.parseDouble(nombrealumno[1]);
            notas[1] = Double.parseDouble(nombrealumno[2]);
            notas[2] = Double.parseDouble(nombrealumno[3]);
            
            double media = (notas[0] + notas[1] + notas[2]) / 3;
            System.out.println("La media del alumno " +nombrealumno[0]+ " es " +media );
            }
        }
    */
}
