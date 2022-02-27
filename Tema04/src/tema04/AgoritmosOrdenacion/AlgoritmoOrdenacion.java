package Tema04.AgoritmosOrdenacion;

public class AlgoritmoOrdenacion {
    public AlgoritmoOrdenacion() {

    }

    public static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void burbuja(int[] vector) {
        int i, j, aux;
        for (i = 0; i < vector.length - 1; i++) {
        for (j = 0; j < vector.length - i - 1; j++) {
        if (vector[j] > vector[j + 1]) {
        swap(vector,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
