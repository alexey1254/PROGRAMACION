package tema05.Ejercicios.ejercicio08;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class VentaMercancia {
    Map<String, Double> producto = new LinkedHashMap<String, Double>();
    Map<String, Integer> compraCliente = new HashMap<String, Integer>();
    String rutaProductos = "C:\\Users\\aleco\\Desktop\\GitHub\\PROGRAMACION\\Tema05\\src\\tema05\\Ejercicios\\ejercicio08\\T05-E08-DatosProductosSupermercado.txt";
    String rutaCompraCliente = "C:\\Users\\aleco\\Desktop\\GitHub\\PROGRAMACION\\Tema05\\src\\tema05\\Ejercicios\\ejercicio08\\T05-E08-DatosCompraCliente.txt";

    /**
     * Implementa al comercio los productos junto con su precio en un Mapa
     * 
     * @throws FileNotFoundException
     */
    public void implementarProductos() throws FileNotFoundException {
        File archivo = new File(rutaProductos);
        Scanner leerDatos = new Scanner(archivo);
        while (leerDatos.hasNextLine()) {
            String clave = leerDatos.next(); // ! Esta linea da problemas
            double precio = leerDatos.nextDouble();
            producto.put(clave, precio);
            leerDatos.nextLine();
        }
        leerDatos.close();
    }

    public void datosCompraCliente() throws FileNotFoundException {
        File archivo = new File(rutaCompraCliente);
        Scanner leerDatos = new Scanner(archivo);
        while (leerDatos.hasNextLine()) {
            compraCliente.put(leerDatos.next(), leerDatos.nextInt());
            leerDatos.nextLine();
        }
        leerDatos.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        VentaMercancia v = new VentaMercancia();
        v.implementarProductos();
        v.datosCompraCliente();
    }
}
