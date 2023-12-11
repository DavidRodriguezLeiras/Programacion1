public class Ejerciciorepasoarray3 {

    public static void main(String[] args) {
        double [][] tabla = new double [4][5];
        
        for(int i = 0;i< tabla.length;i++){
            for(int j = 0; j<tabla[i].length;j++){
                tabla[i][j] = Math.random();
            }
        }
        
        for(int i = 0;i< tabla.length;i++){
            for(int j = 0; j<tabla[i].length;j++){
                System.out.printf("%.2f |",tabla[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
