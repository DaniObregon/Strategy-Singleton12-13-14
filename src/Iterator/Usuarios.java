package Iterator;

import java.util.LinkedList;

public class Usuarios implements UsuarioIterator {

    private LinkedList<User> usuarios = new LinkedList<User>();
    private int posicion = 0;

    public int getPosicion() {
        return posicion;
    }

    @Override
    public User siguiente() {
        User usuario = usuarios.get(posicion);
        posicion++;
        return usuario;
    }

    public void crear(User usuario) {
        usuarios.add(usuario);
    }

    @Override
    public boolean hayMas() {
        //return if(posicion < usuarios.size());
        return posicion < usuarios.size();//si posicion es menor que usuarios.size() devuelve true
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }
}
