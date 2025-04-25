import java.util.Random;
import java.util.Scanner;
public class Juego {
	protected int numeroDeVidas;
	protected int record;
    public Juego(int numeroDeVidas, int record) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = record;
        
    }
    public Juego(int numeroDeVidas) {
    	this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    
    public void reiniciaPartida() {
    	this.numeroDeVidas = getNumeroDeVidas();
    	System.out.println("Partida reiniciada tiene "+ numeroDeVidas+ " vidas");
    }
    public void actualizaRecord() {
    		this.record = this.record+1;
    		System.out.println("Su record ha sido actualizado " + record);
    }
    public boolean quitaVida() {
    	if(getNumeroDeVidas()>0) {	
    		this.numeroDeVidas = this.numeroDeVidas-1;
    		return true;
    	} else {
    		return false;
    	}
    }
    public int getNumeroDeVidas() {
    	return numeroDeVidas;
    }
    public void setNumeroDeVidas(int numeroDeVidas) {
    	this.numeroDeVidas = numeroDeVidas;
    }
    public int getRecord() {
    	return record;
    }
    public void setRecord(int record) {
    	this.record= record;
    }  
}
