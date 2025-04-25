
public class Cola {
    public long arreglo[];
    public int inicio;
    public int fin;
    public Cola(int n) {
        arreglo = new long[n];
        inicio = -1;
        fin = -1;
    }
    public void insert(long e) {
        if (isFull()) {
            System.out.println("Cola llena");
            return;
        }
        if (inicio == -1) {
            inicio = 0;
        }
        fin++;
        arreglo[fin] = e;
    }
    public long remove() {
        if (isEmpty()) {
            System.out.println("Cola vac�a");
            return -1;
        }
        long e = arreglo[inicio];
        inicio++;
        if (inicio > fin) {
            inicio = fin = -1;
        }
        return e;
    }
    public boolean isEmpty() {
        return inicio == -1;
    }
    public boolean isFull() {
        return fin == arreglo.length - 1;
    }
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return fin - inicio + 1;
    }
    public static void main(String[] args) {
        Cola cola = new Cola(10);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        cola.insert(40);
        cola.insert(50);
        System.out.println("Tama�o de la cola: " + cola.size());
        System.out.println("remove() = " + cola.remove());
        System.out.println("remove() = " + cola.remove());
        System.out.println("remove() = " + cola.remove());
        System.out.println("remove() = " + cola.remove());
        System.out.println("remove() = " + cola.remove());
        cola.insert(60);
        System.out.println("Tama�o de la cola: " + cola.size());
        System.out.println("remove() = " + cola.remove());
        cola.insert(70);
        System.out.println("Tama�o de la cola: " + cola.size());
        System.out.println("remove() = " + cola.remove());
    }
}
