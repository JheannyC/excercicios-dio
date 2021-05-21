package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setSalario(100);
        System.out.println(f1.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setSalario(3000);
        System.out.println(atendente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(3000);
        System.out.println(supervisor.calculaImposto());

        Gerente gerente = new Gerente();
        gerente.setSalario(3000);
        System.out.println(gerente.calculaImposto());
    }
}
