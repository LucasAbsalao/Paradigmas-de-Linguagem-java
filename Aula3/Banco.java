public class Banco{
    private Conta[] contas;
    private int indice;

    public Banco(){
        contas = new Conta[100];
        indice = 0;
    }

    public int getProximoAdd(){
        indice++;
        return indice-1;
    }

    public void cadastrar(Conta c){
        contas[getProximoAdd()] = c;
    }

    public void creditar(int indice, int valor){
        contas[indice].creditar(valor);
    }

    public double getSaldo(int indice){
        return contas[indice].getSaldo();
    }
}