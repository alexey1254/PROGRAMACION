package tema05.Ejercicios;


public class MiArrayList {
    private int items[];
    private int maxCapacity;
    private int numElementos;

    /**
     * Constructor donde se le pasan parametros
     * @param max Capacidad maxima del array
     */
    public MiArrayList(int max) {
        this.maxCapacity = max; 
        items = new int[maxCapacity];
        this.numElementos = 0;
    }

    public boolean add(int item) {

    }
    
    public void clear() {
        this.numElementos = 0;
    }

    public int get(int pos) throws Exception {
        if(posValida(pos)) {
            return this.items[pos];
        } else {
            throw new Exception("MiArrayList.get posicion no valida");
        }
    }
    /**
     * Metodo que comprueba la posicion
     * @param p Posicion
     * @return Si la posicion es valida
     */
    private boolean posValida(int p) {
        return p >= 0 && p < this.numElementos;
    }

    public int indexOf(int item) {

    }

    public boolean isEmpty() {
        return this.numElementos == 0;
    }

    public boolean remove(int pos) {

    }

    public boolean set(int pos, int val) {

    }

    public int size() {

    }

    public MiArrayList sort() {

    }

    public int[] toArray() {

    }

    public int pop() throws Exception {
        int a = -1;
        if(!this.isEmpty()) {
            this.numElementos--;
            return this.items[this.numElementos];
        } else {
            throw new Exception("MiArrayList.pop No hay un ultimo elemento.");
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}