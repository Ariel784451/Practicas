package Practicas;

public class Linea {
	public Punto p1;
	public Punto p2;
	public Linea (Punto p1, Punto p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public String toString() {
		return String.format("(%s , %s)",this.p1,this.p2);
	}
	public static void main(String [] args) {
		Punto p1 = new Punto(5,5);
		Punto p2 = new Punto(2,8);
		Linea l1 = new Linea(p1,p2);
		System.out.println(l1);
	}
}
