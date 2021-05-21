package polimorfismo;

public class Supervisor {
    double salario;

    public double calculaImposto(){
        return this.salario * 0.05;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
