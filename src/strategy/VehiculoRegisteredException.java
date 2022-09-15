package strategy;

public class VehiculoRegisteredException extends VehiculoException {
    public VehiculoRegisteredException(String message) {
        super("Existing vehicle " + message);
    }
}
