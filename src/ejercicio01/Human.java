package ejercicio01;

public class Human {
    private String nombre;
    private double dPeso;
    private double dEstatura;

    public Human(String nombre, double dPeso, double dEstatura) {
        this.nombre = nombre;
        this.dPeso = dPeso;
        this.dEstatura = dEstatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getdPeso() {
        return dPeso;
    }

    public void setdPeso(double dPeso) {
        this.dPeso = dPeso;
    }

    public double getdEstatura() {
        return dEstatura;
    }

    public void setdEstatura(double dEstatura) {
        this.dEstatura = dEstatura;
    }
}
