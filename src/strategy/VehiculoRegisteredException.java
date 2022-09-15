package strategy;

/**
 * @author danio
 * @See VehiculoException
 * Clase de excepcion Vehiculo ya registrado
 */
public class VehiculoRegisteredException extends VehiculoException {
    public VehiculoRegisteredException(String message) {
        super("Existing vehicle " + message);
    }
}
