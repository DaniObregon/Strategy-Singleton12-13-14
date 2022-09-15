package strategy;

//TODO: Agregar excepcion personalizada y excepcion especifica

/**
 * @author danio
 * Clase padre excepciones personalizadas para Vehiculo
 */
public class VehiculoException extends Exception{
    public VehiculoException(String message){
        super(message);
    }
}
