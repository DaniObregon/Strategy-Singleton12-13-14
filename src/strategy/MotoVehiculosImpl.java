package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad
 *
 * @See class Vehiculo
 */
public class MotoVehiculosImpl extends Vehiculo implements Vehiculos {
    private List<Vehiculo> listaMotos = new ArrayList();
    double dCc;

    public MotoVehiculosImpl() {
    }

    public MotoVehiculosImpl(String sMarca, String sModelo, double dPrecio, double dCc) {
        super(sMarca, sModelo, dPrecio);
        this.dCc = dCc;
    }

    @Override
    public String toString() {
        return "MotoVehiculosImpl{" +
                "Cc=" + dCc +
                ", marca='" + sMarca + '\'' +
                ", modelo='" + sModelo + '\'' +
                ", precio=" + dPrecio +
                '}';
    }

    /**
     * Añade un nuevo vehículo a la lista de tipo Vehiculo
     *
     * @param vehiculo objeto a añadir a la lista
     * @throws VehiculoRegisteredException
     */
    @Override
    public void save(Vehiculo vehiculo) throws VehiculoRegisteredException {
        //System.out.println("Metodo Save() Moto");
        if (!listaMotos.isEmpty()) {
            for (Vehiculo v : listaMotos) {
                if (this.listaMotos.contains(vehiculo)) {
                    throw new VehiculoRegisteredException("Vehiculo se encuentra registrado.");
                }
                listaMotos.add(vehiculo);
            }
        } else listaMotos.add(vehiculo);
    }

    /**
     * Devuelve la lista de motos registradas
     *
     * @return lista de motos
     * @since 14/09/2022
     */
    @Override
    public List<Vehiculo> findAll() {
        System.out.println("Metodo findAll() Moto");
        return listaMotos;
    }

    /**
     * Elimina un Vehiculo existente en la lista motos
     *
     * @param vehiculo
     * @throws VehiculoNotFoundException si el Vehiculo no se encuentra en la lista
     */
    @Override
    public void delete(Vehiculo vehiculo) {
        System.out.println("Metodo delete() Moto");
        listaMotos.remove(vehiculo);
    }
}
