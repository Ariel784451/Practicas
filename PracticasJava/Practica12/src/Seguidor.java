interface Observador {
    void actualizar(String mensaje);
}
public class Seguidor implements Observador {
    private String nombre;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió una notificación: " + mensaje);
    }
}