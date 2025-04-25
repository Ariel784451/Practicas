public class Punto {
	public float x;
	public float y;
	public float z;
	public Punto(float x, float y,float z) {
		this.x=x;	this.y=y;	this.z=z;
	}
	Punto(){
		x=2;	y=5;	z=5;
	}
	Punto(float i,float j){
		this.x=i;	this.y=j;
	}
	public static void verificarPuntos(Punto p1, Punto p2, Punto p3) {
        if (sonPuntosIguales(p1, p2) && sonPuntosIguales(p2, p3)) {
            System.out.println("Los tres puntos son iguales");
        } else {
            System.out.println("Los puntos no son iguales");
        }
    }
    private static boolean sonPuntosIguales(Punto p1, Punto p2) {
        return p1.x == p2.x && p1.y == p2.y && p1.z == p2.z;
    }
    public static void verificarPrimerPunto(Punto p) {
        if (p.x + p.y == p.z) {
            System.out.println("Para el punto " + p + ", x + y = z se cumple la condicion");
        } else if (p.x + p.z == p.y) {
            System.out.println("Para el punto " + p + ", x + z = y se cumple la condicion");
        } else if (p.y + p.z == p.x) {
            System.out.println("Para el punto " + p + ", y + z = x se cumple la condicion");
        } else {
            System.out.println("Para el punto " + p + ", ninguna suma de coordenadas es igual a otra");
        }
    }
	public String toString() {
		return String.format("(%.2f, %.2f, %.2f)",this.x,this.y,this.z);
	}
	public static void main(String[] args) {
		System.out.println("Instanciar 3 puntos de forma diferente");
		Punto p1 = new Punto(0,3,3); 	System.out.println(p1);
		Punto p2 = new Punto();	System.out.println(p2);
		Punto p3 = new Punto(5,5);	System.out.println(p3);
		System.out.println("Verificar si los tres puntos son iguales");
		verificarPuntos(p1, p2, p3);
		System.out.println("Verificar si un componente es igual a la suma de los otros dos en p1");
		verificarPrimerPunto(p1);
	}
}