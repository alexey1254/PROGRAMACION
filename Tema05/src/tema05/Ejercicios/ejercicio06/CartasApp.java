package tema05.Ejercicios.ejercicio06;

import java.util.ArrayList;
import java.util.List;
import tema05.Ejercicios.ejercicio05.Carta;

public class CartasApp {
    public static void main(String[] args) {
        List<Carta> cartas = new ArrayList<Carta>();
        Carta cAleat;
        while(cartas.size() < 5) {
            cAleat = Carta.cartaAleatoria();
            if(!cartas.contains(cAleat)) {
                cartas.add(cAleat);
            }
        }
        
    }
}