package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author danio
 * @See class Vehiculo
 * @since 14/09/2022
 * Clase de entidad
 */
public class MotoVehiculosImpl extends Vehiculo implements Vehiculos {
    private List<Vehiculo> listaMotos = new ArrayList();
    double dCc;

    public MotoVehiculosImpl() {
    }

    public MotoVehiculosImpl(int iId, String sMarca, String sModelo, double dPrecio, double dCc) {
        super(iId, sMarca, sModelo, dPrecio);
        this.dCc = dCc;
    }

    /**
     * Añade un nuevo vehículo a la lista de tipo Vehiculo
     * @param vehiculo objeto a añadir a la lista
     * @throws VehiculoRegisteredException
     */
    @Override
    public void save(Vehiculo vehiculo) throws VehiculoRegisteredException {
        if (listaMotos.isEmpty()) listaMotos.add(vehiculo);
        else {
            for (Vehiculo v : listaMotos) {
                if (vehiculo.iId == v.iId) {
                    throw new VehiculoRegisteredException("Registered vehicle: " + v.toString());
                }
                listaMotos.add(vehiculo);
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
        return listaMotos;
    }

    /**
     * Elimina un Vehiculo existente en la lista motos
     * @param vehiculo
     * @throws VehiculoNotFoundException si el Vehiculo no se encuentra en la lista
     */
    @Override
    public void delete(Vehiculo vehiculo) throws VehiculoNotFoundException {
        if(!listaMotos.isEmpty()){
            for(Vehiculo v: listaMotos){
                if(vehiculo.iId == v.iId) listaMotos.remove(vehiculo);
                break;
            }
            throw new VehiculoNotFoundException("Vehicle not found " + vehiculo.toString());
        }
    }

    @Override
    public String toString() {
        return "MotoVehiculosImpl{" +
                "ID=" + iId +
                ", Cc=" + dCc +
                ", marca='" + sMarca + '\'' +
                ", modelo='" + sModelo + '\'' +
                ", precio=" + dPrecio +
                '}';
    }
}
