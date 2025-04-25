

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
	public JuegoAdivinaImpar(int numeroDeVidas, int record, int numeroAAdivinar) {
        super(numeroDeVidas, record, numeroAAdivinar);
    }
	@Override
	public boolean validaNumero(int n) {
		if (n > (-1) && n < 11 && n % 2== 1) {
			return true;
		} else if (n > (-1) && n < 11 && n % 2== 0) {
			System.out.println("ERROR");
			return false;
		} else {
            return false;  
        }
	}
}

