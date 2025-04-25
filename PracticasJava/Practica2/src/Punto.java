
public class Punto {
    public float x;
    public float y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
    	return String.format("(%.2f, %.2f)", x, y);
    }
    public static void main(String[] args) {
    	Punto p1 = new Punto(5 ,5 );
    	System.out.println(p1);
    }
}
