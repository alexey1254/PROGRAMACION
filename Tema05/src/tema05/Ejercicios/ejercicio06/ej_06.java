package tema05.Ejercicios.ejercicio06;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.ImageIcon;

import tema05.Ejercicios.ejercicio05.*;

public class ej_06 {
    private Map<String, ImageIcon> listaImagenes = new TreeMap<String, ImageIcon>();

    private void inicializarImagenes() {
        String palos[] = { "bastos", "copas", "espadas", "oros" };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                String nombre = palos[i] + "" + (j + 1);
                ImageIcon imagen = new ImageIcon(
                        "C:\\Users\\aleco\\Desktop\\GitHub\\PROGRAMACION\\Tema05\\src\\tema05\\Ejercicios\\ejercicio06\\barajaEspa\\"
                                + palos[i] + "\\" + palos[i] + "" + (j + 1) + ".png");
                listaImagenes.put(nombre, imagen);
            }
        }
    }

    /**
     * 
     * @param palo   bastos, copas, espadas, oros
     * @param numero [1-12]
     */
    protected ImageIcon getImagenCarta(String palo, int numero) { // bastos, copas, espadas, oros
        return listaImagenes.get(palo + "" + numero);
    }

    public static void main(String[] args) {
        ej_06 i = new ej_06();
        i.inicializarImagenes();
        System.out.println(i.getImagenCarta("bastos", 3));
    }
}
