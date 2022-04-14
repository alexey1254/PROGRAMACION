package tema05.Ejercicios.EjerciciosClase;

public class CartasAPP {
    public static boolean CartaRepetida(Carta[] lista, Carta c, int limite) {
        for (int i = 0; i < limite; i++) {
            if (lista[i].equals(c)) {
                return true;
            }
        }
        return false;
    }

    public static void ImprimeCartas(Carta[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void main(String[] args) {
        Carta[] listaCartas = new Carta[10];
        int contCartas = 0;
        Carta C;
        while (contCartas < listaCartas.length) {
            C = Carta.CartaAleatoria();
            if (!CartaRepetida(listaCartas, C, contCartas)) {
                listaCartas[contCartas] = C;
                contCartas++;
            }
        }
        ImprimeCartas(listaCartas);
    }
}
