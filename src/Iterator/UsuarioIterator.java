package Iterator;

public interface UsuarioIterator {

    //Hay mas usuarios en el iterador
    boolean hayMas();

    //Reiniciar el contador (el iterador)
    void reinicia();

    //Obtiene el siguiente
    User siguiente();


}
