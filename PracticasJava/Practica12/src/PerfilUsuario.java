import java.util.ArrayList;
import java.util.List;
public class PerfilUsuario {
    private String nombre;
    private List<Observador> seguidores = new ArrayList<>();

    public PerfilUsuario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSeguidor(Observador seguidor) {
        seguidores.add(seguidor);
    }

    public void quitarSeguidor(Observador seguidor) {
        seguidores.remove(seguidor);
    }

    public void notificarSeguidores(String mensaje) {
        for (Observador seguidor : seguidores) {
            seguidor.actualizar(mensaje);
        }
    }

    public void publicarFoto() {
        System.out.println(nombre + " ha subido una nueva foto ");
        notificarSeguidores(nombre + " ha publicado una nueva foto.");
    }
    public static void main(String[] args) {
        PerfilUsuario juan = new PerfilUsuario("Juan");
        Seguidor maria = new Seguidor("María");
        Seguidor pedro = new Seguidor("Pedro");
        juan.agregarSeguidor(maria);
        juan.agregarSeguidor(pedro);
        juan.publicarFoto(); 
    }
}