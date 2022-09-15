package ejercicio01;

public class IMC implements ICalculable{
    private Double imc;
    private double dPesoMinimo;
    private double dPesoMaximo;

    @Override
    public String calcularIMC(Human human) {
        imc = human.getdPeso() / Math.pow(human.getdEstatura(), 2);
        if(imc < 18.5) return "Bajo peso";
        if(imc > 18.5 && imc <= 25) return "Normal";
        return (imc > 25 && imc <= 30) ? "Sobrepeso" : "Obesidad";
    }

    @Override
    public String calcularPI(Human human) throws IMCException{
        if (imc == null) {
            throw new IMCException("Para calcular el PI, debes calcular primero el IMC");
        }
        dPesoMinimo = Math.pow(human.getdEstatura(), 2) * 18.5;
        dPesoMaximo = Math.pow(human.getdEstatura(), 2) * 25;
        return "Su peso ideal es entre " + dPesoMinimo + " y " + dPesoMaximo;
    }
}
