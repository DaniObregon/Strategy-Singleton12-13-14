package ejercicio01;

public interface ICalculable {
    public String calcularIMC(Human human);
    public String calcularPI(Human human) throws IMCException;
}
