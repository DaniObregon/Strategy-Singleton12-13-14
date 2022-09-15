package strategy;

import java.util.ArrayList;
import java.util.List;

public class CocheVehiculosImpl extends Vehiculo implements Vehiculos {
    private List<Vehiculo> coches = new ArrayList();
    int nPuertas;
    double cc;

    public CocheVehiculosImpl() {
    }

    public CocheVehiculosImpl(String marca, String modelo, double precio, int nPuertas, double cc) {
        super(marca, modelo, precio);
        this.nPuertas = nPuertas;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "CocheVehiculosImpl{" +
                "nPuertas=" + nPuertas +
                ", cc=" + cc +
                ", marca='" + sMarca + '\'' +
                ", modelo='" + sModelo + '\'' +
                ", precio=" + dPrecio +
                '}';
    }

    @Override
    public void save(Vehiculo vehiculo) {
        System.out.println("Metodo Save() Coche");
        coches.add(vehiculo);
    }

    @Override
    public List<Vehiculo> findAll() {
        System.out.println("Metodo findAll() Coche");
        return coches;
    }

    @Override
    public void delete(Vehiculo vehiculo) {
        System.out.println("Metodo delete() Coche");
        coches.remove(vehiculo);
    }
}
