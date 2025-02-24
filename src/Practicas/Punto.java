package Practicas;

public class Punto {
	public float x;
	public float y;
	public Punto(float x, float y) {
		this.x=x;
		this.y=y;
	}
	public float[] Coordenadas_Cartesianas() {
		return new float[] {this.x,this.y};
	}
	public float[] Coordenadas_Polares() {
		float radio =(float)Math.sqrt(this.x * this.x+ this.y*this.y);
		float angulo =(float)Math.atan(this.y/this.x);
		angulo = (float) Math.toDegrees(angulo);
		return new float[] {radio,angulo};
	}
	public String toString() {
		return String.format("(%.2f,%.2f)",this.x,this.y);
	}
	public static void main(String[] args) {
		Punto p1 = new Punto(0,3);
		System.out.println(p1);
		float []a =p1.Coordenadas_Cartesianas();
		System.out.println(a[0]+ " "+ a[1]);
		float b[]= p1.Coordenadas_Polares();
		System.out.println(b[0]+ " "+ b[1]);
	}
}
