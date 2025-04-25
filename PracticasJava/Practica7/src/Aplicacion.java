
public class Aplicacion {
	public static void main(String[] args) {
		JuegoAdivinaNumero j1= new JuegoAdivinaNumero(3, 0, 0);
		JuegoAdivinaNumero j2= new JuegoAdivinaImpar(2, 0, 0);
		JuegoAdivinaNumero j3= new JuegoAdivinaPar(3, 0, 0);
		j1.Juega();
		j2.Juega();
		j3.Juega();
	}
}
