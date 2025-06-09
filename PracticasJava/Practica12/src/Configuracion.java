
public class Configuracion {
	private static Configuracion instancia;
	private String valor;
	private Configuracion() {}
	public static Configuracion getInstancia() {
		if(instancia == null) {
			instancia = new Configuracion();
		}
		return instancia;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor=valor;
	}
    public static void main(String[] args) {
        Configuracion config1 = Configuracion.getInstancia();
        config1.setValor("Modo oscuro");
        Configuracion config2 = Configuracion.getInstancia();
        System.out.println("Valor de config2: " + config2.getValor());
        if (config1 == config2) {
            System.out.println("config1 y config2 son la misma instancia.");
        } else {
            System.out.println("config1 y config2 son distintas instancias.");
        }
    }
}
