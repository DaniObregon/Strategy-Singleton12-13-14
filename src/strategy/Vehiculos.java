package strategy;

import java.util.List;

public interface Vehiculos {
    void save(Vehiculo vehiculo) throws VehiculoRegisteredException;
    List<Vehiculo> findAll();
    void delete(Vehiculo vehiculo) throws  VehiculoNotFoundException;
}
