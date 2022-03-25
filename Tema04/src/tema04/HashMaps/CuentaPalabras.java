package tema04.HashMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CuentaPalabras {
    private static final String RutaWindows ="D:\\Proyectos\\PRO\\ProgramacionANT\\src\\Tema04\\DatosEjercicios\\Tema04-HashMap.E01.txt";
    
    /**
     * Cuenta en un hashmap las palabras
     * @throws FileNotFoundException 
     * @return Un HashMap con las palabras contadas.
     */
    public static HashMap<String,Integer> Contar() throws FileNotFoundException {
        HashMap<String,Integer> palabras = new HashMap<>();
        File archivo = new File(RutaWindows);
        Scanner scanner = new Scanner(archivo);
        String linea = scanner.nextLine();
        while(!linea.equals("-1")) {    // Pasar por cada linea
            String[] palabrasLinea = linea.split("[ ,.;\t]");
            for (int i = 0; i < palabrasLinea.length; i++) {    // Poner cada palabra en un array y en el hashmap
                if(palabras.get(palabrasLinea[i]) == null) {    // Comprobamos que no esta en el hashmap
                    palabras.put(palabrasLinea[i],1);           // Poner la palabra en donde corresponda dentro del hashmap
                } else {                                        // Sabemos que está en el hashmap por el if de antes
                    palabras.put(palabrasLinea[i], palabras.get(palabrasLinea[i])+1);
                }
            }
            linea = scanner.nextLine();
        }
        palabras.remove("");
        return palabras;
    }
    
    /**
     * Genera un informe con las palabras contadas de mayor a menor
     * @param palabras 
     */
    public static void generarInforme(HashMap<String,Integer> palabras) {
        
    }
    
    /**
     * Main para pruebas
     * @param args
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,Integer> a = Contar();
        //generarInforme(a);


    }
}