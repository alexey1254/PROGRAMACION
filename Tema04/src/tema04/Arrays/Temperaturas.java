package tema04.Arrays;



import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Temperaturas {
    static int[][] Temperaturas = new int [12][];
    static final String Fichero = "DatosEjercicios/Tema04-ExtraArrays.E01.DatosVentasCoches.txt";
    
    public static void leerDatos () throws FileNotFoundException {
        File entrada = new File("DatosEjercicios/Tema04-ExtraArrays.E01.DatosVentasCoches.txt");
        Scanner lector = new Scanner(entrada);
    }
    public static void medidas() {
        for (int i = 0; i < Temperaturas.length; i++) { // Recorro meses
            int suma=0;
            for (int j = 0; j < Temperaturas[i].length; j++) { // Recorro dias del mes i
                suma += Temperaturas[i][j];
            }
            System.out.println("Mes "+i+" temperatura media: "+((double)suma/Temperaturas[i].length));
        }
    }
    
    public static void main(String[] args) {

        
    }
}

