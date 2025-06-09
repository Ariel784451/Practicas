public class Obra {
    String titulo;
    String material;
    Artista a1, a2;
    Anuncio anuncio;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.anuncio = anuncio;
    }

    public Artista getArtistaMayorExperiencia() {
        return (a1.getAniosExperiencia() > a2.getAniosExperiencia()) ? a1 : a2;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public double getPrecioAnuncio() {
        return (anuncio != null) ? anuncio.getPrecio() : 0;
    }
}
