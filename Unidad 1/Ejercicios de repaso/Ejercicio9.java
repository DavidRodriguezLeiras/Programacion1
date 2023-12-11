import java.util.Scanner;

public class Ejercicio9 {

    /* Escribe un programa que nos diga o horóscopo a partir do día e mes de nacemento introducido por teclao dunha persoa.
     * O proceso realizaráse para 5 persoas.
     *
     * 
     */

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n_personas=0;
        int mes=0;
        int dia=0;
        //En este array guardaremos el nombre de la persona y su signo del zodiaco

        System.out.println("De que nº de personas hay que saber su horoscopo?");
        n_personas=scan.nextInt();
        String[][] nombrePersonas= new String [n_personas][2];

        for (int i = 0; i < n_personas ; i++) {
            scan.nextLine();
            System.out.println("Dime el nombre de la persona");
            nombrePersonas[i][0]=scan.nextLine();
            System.out.println("En que mes nacio?(dime el nº de mes)");
            mes=scan.nextInt();
            System.out.println("En que dia nacio?");
            dia=scan.nextInt();
            nombrePersonas[i][1]= calcularsigno(mes, dia);
        }

        for (int i = 0; i< n_personas; i++){
            System.out.println("El signo del zodiaco de "+ nombrePersonas[i][0] + " es "+ nombrePersonas[i][1]);
        }
        scan.close();

    }

    static String calcularsigno(int a, int b){
        String signozodiaco="";

        switch (a) {

            case 1:
                if (b>=1 &&  b<=19) { 
                signozodiaco="Capricornio";
                } else {
                signozodiaco="Acuario";  
                }
            break;

            case 2:
                if (b>=1 &&  b<=18) { 
                    signozodiaco="Acuario";
                    } else {
                    signozodiaco="Piscis";  
                    }
            break;

            case 3:
                if (b>=1 &&  b<=20) { 
                    signozodiaco="Piscis";
                    } else {
                    signozodiaco="Aries";  
                    }
            break;

            case 4:
                if (b>=1 &&  b<=19) { 
                    signozodiaco="Aries";
                    } else {
                    signozodiaco="Tauro";  
                    }
            break;

            case 5:
                if (b>=1 &&  b<=20) { 
                    signozodiaco="Tauro";
                    } else {
                    signozodiaco="Geminis";  
                    }
            break;

            case 6:
                if (b>=1 &&  b<=20) { 
                    signozodiaco="Geminis";
                    } else {
                    signozodiaco="Cancer";  
                    }
            break;

            case 7:
                if (b>=1 &&  b<=22) { 
                    signozodiaco="Cancer";
                    } else {
                    signozodiaco="Leo";  
                    }
            break;

            case 8:
                if (b>=1 &&  b<=22) { 
                    signozodiaco="Leo";
                    } else {
                    signozodiaco="Virgo";  
                    }
            break;

            case 9:
                if (b>=1 &&  b<=22) { 
                    signozodiaco="Virgo";
                    } else {
                    signozodiaco="Libra";  
                    }
            break;

            case 10:
                if (b>=1 &&  b<=22) { 
                    signozodiaco="Libra";
                    } else {
                    signozodiaco="Escorpio";  
                    }
            break;

            case 11:
                if (b>=1 &&  b<=21) { 
                    signozodiaco="Escorpio";
                    } else {
                    signozodiaco="Sagitario";  
                    }
            break;

            case 12:
                if (b>=1 &&  b<=20) { 
                    signozodiaco="Sagitario";
                    } else {
                    signozodiaco="Capricornio";  
                    }
            break;


        }

        return signozodiaco;
    }
    
}
