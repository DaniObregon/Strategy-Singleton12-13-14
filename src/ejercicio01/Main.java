package ejercicio01;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Giuseppe", 100, 1.76);
        IMC imc = new IMC();
        try {
            System.out.println(imc.calcularPI(human));
        } catch (IMCException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(imc.calcularIMC(human));
    }
}
