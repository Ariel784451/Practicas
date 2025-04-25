
public class FiguraGeometrica {
	static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	static double calcularArea(double base, double altura) {
		return base*altura;
	}
	static double calcularArea(double base, double altura, boolean esTriangulo) {
		if(esTriangulo) {
			return (base*altura)/2;
		}
		return -1;
	}
	static double calcularArea(double baseMayor, double baseMenor, double altura, boolean esTrapecio) {
		if(esTrapecio) {
			return ((baseMayor+baseMenor)*altura)/2;
		}
		return -1;
	}
	static double calcularArea(int lados, double lado, double apotema) {
		if(lados==5) {
			double perimetro = 5* lado;
			return (perimetro * apotema)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(calcularArea(5)); 
        System.out.println(calcularArea(4, 6)); 
        System.out.println(calcularArea(3, 5, true)); 
        System.out.println(calcularArea(8, 5, 4, true)); 
        System.out.println(calcularArea(5, 6, 4)); 
	}
}
