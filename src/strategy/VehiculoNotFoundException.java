package strategy;

/**
 * @author danio
 * Clase de excepcion Vehiculo no encontrado
 */
public class VehiculoNotFoundException extends VehiculoException{
    public VehiculoNotFoundException(String message) {
        super("Vehicle not found: " + message);
    }
}
