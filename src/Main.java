import com.rafael.freela.Freela;

public class Main {
    public static void main(String[] args) {
        Freela job = new Freela();

        job.setMediaSalario(3000);
        job.setHoras(8);
        job.setDias(5);

        job.calcularValorHora();

        System.out.println(job.getValorHora());
    }
}
