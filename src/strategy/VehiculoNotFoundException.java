package strategy;

public class VehiculoNotFoundException extends VehiculoException{
    public VehiculoNotFoundException(String message) {
        super("Vehicle not found: " + message);
    }
}
