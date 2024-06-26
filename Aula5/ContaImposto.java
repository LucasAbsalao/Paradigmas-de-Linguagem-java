public class ContaImposto extends Conta{
    private static final double CPMF = 0.001;

    public ContaImposto (String numero){
        super(numero);
    }

    public void debitar(double valor){
        double imposto = valor * CPMF;
        double total = valor + imposto;
        this.setSaldo(this.getSaldo - total);
    }
}