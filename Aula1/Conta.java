public class Conta{
    private String numero;
    private double saldo;


    public Conta(){
        this("",0);
    }

    public Conta(String numeroInicial, double saldoInicial){
        numero = numeroInicial;
        saldo = saldoInicial;
    }

    public void creditar(int valor){
        saldo += valor;
        System.out.println("Foram creditados " + valor + " e seu saldo se tornou " + saldo);
    }

    public void compraProduto (Produto produto){
        saldo -= produto.getPreco();
        System.out.println(numero + " comprou o item " + produto.getNome());
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumero(){
        return numero;
    }
}