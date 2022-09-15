package ejercicio02strategy;

//TODO: añadir clase de excepciones

/**
 * Clase de entidad Vehiculo abstract
 * @author danio
 * @since 15/09/2022
 */
public abstract class Vehiculo {
    int iId;
    String sMarca;
    String sModelo;
    double dPrecio;

    public Vehiculo() {
    }

    public Vehiculo(int iId, String sMarca, String sModelo, double Precio) {
        this.iId = iId;
        this.sMarca = sMarca;
        this.sModelo = sModelo;
        this.dPrecio = Precio;
    }
}
