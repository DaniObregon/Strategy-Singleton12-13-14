package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad
 * @See class Vehiculo
 * @since 14/09/2022
 */
public class CocheVehiculosImpl extends Vehiculo implements Vehiculos {
    private List<Vehiculo> listaCoches = new ArrayList();
    int nPuertas;
    double cc;

    public CocheVehiculosImpl() {
    }

    public CocheVehiculosImpl(int iId, String marca, String modelo, double precio, int nPuertas, double cc) {
        super(iId, marca, modelo, precio);
        this.nPuertas = nPuertas;
        this.cc = cc;
    }

    /**
     * Añade un nuevo vehículo a la lista de tipo Vehiculo
     * @param vehiculo objeto a añadir a la lista
     * @throws VehiculoRegisteredException
     * @since 14/09/2022
     */
    @Override
    public void save(Vehiculo vehiculo) throws VehiculoRegisteredException {
        if (listaCoches.isEmpty()) listaCoches.add(vehiculo);
        else {
            for (Vehiculo v : listaCoches) {
                if (vehiculo.iId == v.iId) {
                    throw new VehiculoRegisteredException("Registered vehicle: " + v.toString());
                }
                listaCoches.add(vehiculo);
                break;
            }
        }
    }

    /**
     * Devuelve la lista de motos registradas
     * @return lista de motos
     * @since 14/09/2022
     */
    @Override
    public List<Vehiculo> findAll() {
        return listaCoches;
    }

    /**
     * Elimina un Vehiculo existente en la lista motos
     * @param vehiculo
     * @throws VehiculoNotFoundException si el Vehiculo no se encuentra en la lista
     * @since 14/09/2022
     */
    @Override
    public void delete(Vehiculo vehiculo) throws VehiculoNotFoundException {
        if(!listaCoches.isEmpty()){
            for(Vehiculo v: listaCoches){
                if(vehiculo.iId == v.iId) listaCoches.remove(vehiculo);
                break;
            }
            throw new VehiculoNotFoundException("Vehicle not found " + vehiculo.toString());
        }
    }

    @Override
    public String toString() {
        return "CocheVehiculosImpl{" +
                "ID=" + iId +
                ", nPuertas=" + nPuertas +
                ", cc=" + cc +
                ", marca='" + sMarca + '\'' +
                ", modelo='" + sModelo + '\'' +
                ", precio=" + dPrecio +
                '}';
    }
}
