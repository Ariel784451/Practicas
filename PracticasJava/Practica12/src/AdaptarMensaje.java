class SistemaDeMensajeriaAntiguo {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje de versión antigua: " + mensaje);
    }
}

interface Mensajero {
    void enviar(String mensaje);
}

public class AdaptarMensaje implements Mensajero {
    private SistemaDeMensajeriaAntiguo sistemaAntiguo;

    public AdaptarMensaje(SistemaDeMensajeriaAntiguo sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    public void enviar(String mensaje) {
        sistemaAntiguo.enviarMensaje(mensaje);
    }

    public static void main(String[] args) {
        SistemaDeMensajeriaAntiguo sistemaAntiguo = new SistemaDeMensajeriaAntiguo();
        Mensajero mensajero = new AdaptarMensaje(sistemaAntiguo);

        mensajero.enviar("¡Hola mundo!");
    }
}
