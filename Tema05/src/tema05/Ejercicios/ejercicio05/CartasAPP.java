package tema05.Ejercicios.ejercicio05;

import java.util.ArrayList;

public class CartasAPP extends Carta {
    protected ArrayList<Carta> carta = new ArrayList<Carta>();
    protected int puntos;

    public void cartasAleatorias() {
        Carta cartaAuxiliar = new Carta();
        carta.add(cartaAuxiliar);

        for (int i = 0; i < 4; i++) {
            do {
                cartaAuxiliar = new Carta();
            } while (this.carta.contains(cartaAuxiliar));

            carta.add(cartaAuxiliar);
        }
        int i = 1;
    }

    public ArrayList<Carta> verCartas() {
        return this.carta;
    }

    public void addPuntos() {
        for (Carta cartaAleatoria : this.carta) {
            String cartaStr = "" + cartaAleatoria;

            if (cartaStr.contains("as")) {
                this.puntos += 11;
            } else if (cartaStr.contains("tres")) {
                this.puntos += 10;
            } else if (cartaStr.contains("sota")) {
                this.puntos += 2;
            } else if (cartaStr.contains("caballo")) {
                this.puntos += 3;
            } else if (cartaStr.contains("rey")) {
                this.puntos += 4;
            }
        }
    }

    public int getPuntos() {
        return this.puntos;
    }

    public static void main(String args[]) {
        CartasAPP a = new CartasAPP();
        a.cartasAleatorias();
        a.addPuntos();
        System.out.printf("La puntuacion total es de: %d puntos.", a.getPuntos());
    }
}
