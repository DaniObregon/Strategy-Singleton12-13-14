package Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new User("Giuseppe", 34));
        usuarios.crear(new User("Anna", 17));
        usuarios.crear(new User("Fiorella", 22));
        usuarios.crear(new User("Mireya", 33));
        usuarios.crear(new User("Pedro", 54));

        while (usuarios.hayMas()) {
            User usuario = usuarios.siguiente();
            System.out.println("usuario = " + usuario.getNombre());
        }

        usuarios.crear(new User("Daniel", 36));
        User usuario = usuarios.siguiente();
        System.out.println("usuario = " + usuario.getNombre());

        usuarios.reinicia();

        while (usuarios.hayMas()) {
            usuario = usuarios.siguiente();
            System.out.println("usuario "+ usuarios.getPosicion()+" = " + usuario.getNombre());
        }

    }

}