import com.rafael.freela.Freela;

public class Main {
    public static void main(String[] args) {
        Freela job = new Freela();

        job.setSalarioMedio(2500);
        job.setHora(8);
        job.setDia(5);

        job.custosFixos[0] = 200;
        job.custosFixos[1] = 300;
        job.custosFixos[2] = 50;
        job.custosFixos[3] = 150;

        job.custosVariaveis[0] = 150;
        job.custosVariaveis[1] = 200;
        job.custosVariaveis[2] = 50;
        job.custosVariaveis[3] = 100;

        job.calcularCustosHora();
        job.calcularSalarioHora();
        job.calcularTotalHora();
        System.out.println("Custos Hora: " + job.getCustoHora());
        System.out.println("Salario hora: " + job.getSalarioHora());
        System.out.println("Valor hora total: " + job.getTotalHora());
    }
}
