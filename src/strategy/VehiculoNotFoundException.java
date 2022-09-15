package strategy;

/**
 * @author danio
 * @See VehiculoException
 * Clase de excepcion Vehiculo no encontrado
 */
public class VehiculoNotFoundException extends VehiculoException{
    public VehiculoNotFoundException(String message) {
        super("Vehicle not found: " + message);
    }
}
