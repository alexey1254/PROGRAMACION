package tema05.Ejercicios.EjerciciosClase;

public class Carta { // 0 1 2 3
    protected static String palos[] = { "Bastos", "Copas", "Espadas", "Oros" };
    protected String palo;
    protected byte numero;

    public byte getNumero() {
        return this.numero;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public Carta(String palo, byte numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object c) {
        Carta e = (Carta) c;
        return this.palo.equals(e.palo) && this.numero == e.numero;
    }

    @Override
    public String toString() {

        return String.format("%d de %s", this.numero, this.palo);
    }

    public static Carta CartaAleatoria() {
        byte palo;
        byte numCarta;
        palo = (byte) (Math.random() * 4);
        numCarta = (byte) (Math.random() * 12 + 1);
        return new Carta(palos[palo], numCarta);
    }
}
