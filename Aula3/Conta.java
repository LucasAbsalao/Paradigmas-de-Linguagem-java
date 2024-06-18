public class Conta{
    private String numero;
    private double saldo;

    public Conta(String nome){
        numero = nome;
        saldo = 0;
    }

    public void creditar(double valor){
        saldo +=valor;
    }

    public String getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
}