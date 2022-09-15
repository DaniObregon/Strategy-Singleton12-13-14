package Iterator;

public class User {
    private String nombre;
    private int edad;

    private User(){}

    public User(String nombre , int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
}
