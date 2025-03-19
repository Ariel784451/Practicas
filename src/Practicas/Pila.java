package Practicas;
public class Pila {
	public long arreglo [];
	public int top;
	public Pila(int n) {
		arreglo=new long[n];
		top=-1;
	}
	public void push(int e) {
		top++;
		arreglo[top]= e;
	}
    public long peek() {
        if (isEmpty()) {
            System.out.println("pila vacía no se puede hacer peek");
            return -1;
        }
        return arreglo[top];
    }
    public long pop() {
        if (isEmpty()) {
            System.out.println("pila vacía no se puede hacer pop");
            return -1;
        }
        long e = arreglo[top];
        top--;
        return e;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arreglo.length - 1;
    }

	public static void main(String[] args) {
		Pila pila = new Pila (10);
		pila.push(10);
		pila.push(20);
		pila.push(30);

        System.out.println("peek() = " + pila.peek());
        System.out.println("pop() = " + pila.pop());
        System.out.println("pop() = " + pila.pop());
        System.out.println("pop() = " + pila.pop());
        System.out.println("pop() = " + pila.pop());
        System.out.println("isEmpty() = " + pila.isEmpty());
        System.out.println("isFull() = " + pila.isFull());
	} 
}

