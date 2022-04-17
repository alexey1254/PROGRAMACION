package tema05.Ejercicios.ejercicio05;

public class Carta {
    private static String[] numeros = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo",
            "rey" };
    private static String[] palos = { "bastos", "copas", "espadas", "oros" };

    protected String numeroCarta;
    protected String paloCarta;

    public Carta() {
        this.numeroCarta = numeros[(int) (Math.random() * 10)];
        this.paloCarta = palos[(int) (Math.random() * 4)];
    }

    public String getNumero() {
        return numeroCarta;
    }

    public String getPalo() {
        return paloCarta;
    }

    @Override
    public String toString() {
        return this.numeroCarta + " de " + this.paloCarta;
    }
}
