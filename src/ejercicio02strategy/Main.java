package ejercicio02strategy;

import java.util.List;
/**
 * @author danio
 * @since 15/09/2022
 * Se modificaron variables para implementar notación húngara.
 * Se agregaron clases de Excepciones personalizadas:
 * VehiculoException, VehiculoNotFoundException, VehiculoRegisteredException.
 * Se realizan pruebas de ejecuci[on de los metodos.
 */

public class Main {
    public static void main(String[] args) {
        Vehiculos ivCoche = new CocheVehiculosImpl();
        Vehiculos ivMoto = new MotoVehiculosImpl();

        crear(ivMoto, new MotoVehiculosImpl(1, "Honda", "R1", 10000, 600));
        crear(ivMoto, new MotoVehiculosImpl(2, "Honda", "R1", 10000, 600));
        crear(ivMoto, new MotoVehiculosImpl(3,"Yamaha", "Tornado", 3000, 250));
        crear(ivCoche, new CocheVehiculosImpl(1, "Toyota", "Raize", 10000, 5, 1000));
        crear(ivCoche, new CocheVehiculosImpl(2, "VW", "Scirocco", 15000, 3, 1800));

        for (Vehiculo v : listar(ivCoche)) {
            System.out.println("v = " + v);
        }
        for (Vehiculo v : listar(ivMoto)) {
            System.out.println("v = " + v);
        }
    }

    public static void crear(Vehiculos vehiculos, Vehiculo vehiculo) {
        try {
            vehiculos.save(vehiculo);
        } catch (VehiculoRegisteredException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static List<Vehiculo> listar(Vehiculos vehiculos) {
        return vehiculos.findAll();
    }
}