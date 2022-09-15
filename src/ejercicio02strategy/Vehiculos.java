package ejercicio02strategy;

import java.util.List;

/**
 * Interface Vehiculos
 * Declara los metodos que deberan implementar todas las clases de Vehiculos
 * @since 14/09/2022
 */
public interface Vehiculos {
    void save(Vehiculo vehiculo) throws VehiculoRegisteredException;
    List<Vehiculo> findAll();
    void delete(Vehiculo vehiculo) throws  VehiculoNotFoundException;
}
