package polimorfismo;

public class Funcionario{

    double salario;

    public double calculaImposto(){
        return this.salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
