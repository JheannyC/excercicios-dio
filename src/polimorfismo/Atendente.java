package polimorfismo;

public class Atendente extends Funcionario{

    double salario;

    public double calculaImposto(){
        return this.salario * 0.01;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
