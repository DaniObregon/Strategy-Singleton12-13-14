package strategy;

//TODO: añadir clase de excepciones

/**
 * Clase de entidad Vehiculo
 * @param sMarca
 * @param sModelo
 * @param dPrecio
 */
public abstract class Vehiculo {
    String sMarca;
    String sModelo;
    double dPrecio;

    public Vehiculo() {
    }

    public Vehiculo(String sMarca, String sModelo, double Precio) {
        this.sMarca = sMarca;
        this.sModelo = sModelo;
        this.dPrecio = Precio;
    }
}
