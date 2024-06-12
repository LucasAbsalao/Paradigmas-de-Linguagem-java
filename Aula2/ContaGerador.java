public class ContaGerador{
    private int numero;
    private double saldo;
    private static int proximo = 0;

    public ContaGerador(int saldo){
        this.numero = ContaGerador.getProximo();
        this.saldo = saldo;
    }

    private static int getProximo(){
        proximo = proximo+1;
        return proximo;
    }

    public void printConta(){
        System.out.println("Conta: " + numero + " Saldo: " + saldo);
    }
}