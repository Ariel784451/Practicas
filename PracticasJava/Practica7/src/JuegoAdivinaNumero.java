import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
	private int numeroAAdivinar;
	public JuegoAdivinaNumero(int numeroDeVidas, int record, int numeroAAdivinar) {
		super(numeroDeVidas, record);
		this.numeroAAdivinar= numeroAAdivinar;
	}
	public JuegoAdivinaNumero(int numeroDeVidas, int numeroAAdivinar) {
		super(numeroDeVidas);
		this.numeroAAdivinar= numeroAAdivinar;
	}
	public void Juega () {
		reiniciaPartida();
		Random r = new Random(); 
    	int random =r.nextInt(10)+1;
    	System.out.println("Adivine el numero entre 1 y 10");
    	Scanner teclado = new Scanner(System.in);
    	while (getNumeroDeVidas()>0) {
    		int intento = teclado.nextInt();
    		if (validaNumero(intento)) {
    		} else { System.out.println("Numero no valido"); break; }
    		if (intento == random) {
    			System.out.println("Acertaste!!");
    			actualizaRecord();
    			break;
    		} else {
    			if (quitaVida()) {
    			if (intento > random && getNumeroDeVidas() > 0) {
    				System.out.println("El numero q ingresaste es mayor");
    				System.out.println("su numero de vidas es " +getNumeroDeVidas());
    				System.out.println("intentelo de nuevo");
    			} else if (intento < random && getNumeroDeVidas() > 0) {
    				System.out.println("El numero q ingresaste es menor");
    				System.out.println("su numero de vidas es " +getNumeroDeVidas());
    				System.out.println("intentelo de nuevo");
    			}  else {
    				System.out.println("Su numero de vidas se agoto");
    				break;
    			}
    			}
    		}
    	}
	}
	public boolean validaNumero(int n) {
		if (n > (-1) && n < 11) {
			return true;
		} else {
			return false;
		}
	}
}
