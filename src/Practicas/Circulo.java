package Practicas;

public class Circulo {
	public Punto centro;
	public float radio;
	public Circulo(Punto centro, float radio) {
		this.centro=centro;
		this.radio=radio;
	}
	public String toString() {
		return String.format("(%s , %.2f)",this.centro,this.radio);
	}
	public static void main(String[]args) {
		Punto p1=new Punto(0,0);
		Circulo c1=new Circulo(p1, 50);
		System.out.println(c1);
	}
}
