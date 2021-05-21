package polimorfismo;

public class Gerente extends Funcionario{

    double salario;

    public double calculaImposto(){
        return this.salario * 0.1;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
