public class Artista {
    String nombre;
    String ci;
    int aniosExperiencia;

    public Artista(String nombre, String ci, int aniosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }
}


