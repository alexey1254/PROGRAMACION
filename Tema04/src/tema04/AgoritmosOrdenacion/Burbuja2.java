
package tema04.AgoritmosOrdenacion;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Algoritmo de ordenacion burbuja mejorado
 * @author daw
 */
public class Burbuja2 {
    private static double[] datos = new double[20];
    
    /**
     * Lee los datos de un archivo de texto
     * @throws FileNotFoundException
     */
    public static void leerDatos() throws FileNotFoundException {
        Scanner fDatos=new Scanner(new File("/media/daw/Vbox&others/Proyectos/PRO/Tema04/src/tema04/DatosEjercicios/Tema04-ExtraArrays.E05.DatosTemperaturas.txt"));
        for (int i = 0; i < datos.length; i++) {
            datos[i]=fDatos.nextDouble();
        }
        fDatos.close();
    }
    public static void media() {
        
    }
    
    /**
     * 
     * @param v
     * @param i
     * @param j
     */
    public static void swap(double[] v, int i, int j) {
        double aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void burbuja(double[] vector) {
        int i, j;
        double aux;
        for (i = 0; i < vector.length - 1; i++) {
        for (j = 0; j < vector.length - i - 1; j++) {
        if (vector[j] > vector[j + 1]) {
        swap(vector,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        leerDatos();
        System.out.println("Datos "+ Arrays.toString(datos));
        burbuja(datos);
        System.out.println("Ordenado "+Arrays.toString(datos));
    }
}
