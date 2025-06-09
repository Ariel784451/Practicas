public class Main {
    public static void main(String[] args) {
        Artista art1 = new Artista("Ana", "123", 10);
        Artista art2 = new Artista("Luis", "456", 12);
        Artista art3 = new Artista("Carlos", "789", 15);
        Artista art4 = new Artista("Marta", "321", 8);

        Anuncio anuncio1 = new Anuncio(1, 5000);

        Pintura pintura1 = new Pintura("Sol", "Oleo", art1, art2, anuncio1, "Abstracto");
        Pintura pintura2 = new Pintura("Luna", "Acrilico", art3, art4, null, "Realismo");

        Artista mayor1 = pintura1.getArtistaMayorExperiencia();
        Artista mayor2 = pintura2.getArtistaMayorExperiencia();

        Artista mayorFinal = (mayor1.getAniosExperiencia() > mayor2.getAniosExperiencia()) ? mayor1 : mayor2;
        System.out.println("Artista con más experiencia: " + mayorFinal.getNombre());
        Anuncio anuncio2 = new Anuncio(2, 3000);
        pintura2.setAnuncio(anuncio2);
        double total = pintura1.getPrecioAnuncio() + pintura2.getPrecioAnuncio();
        System.out.println("Monto total de venta: " + total);
    }
}