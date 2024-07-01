public abstract class ContaAbstrata {
    private String numero;
    private double saldo;

    public ContaAbstrata (String num){
        this.numero = num;
        this.saldo = 0.0;
    }

    public void creditar (double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    protected void setSaldo(double valor){
        this.saldo = valor;
    }

    public abstract void debitar(double valor);
}