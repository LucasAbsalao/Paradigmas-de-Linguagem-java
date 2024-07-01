public class RepositorioContasArray implements RepositorioContas{
    private ContaAbstrata contas[];
    private int indice;

    public RepositorioContasArray (int n){
        this.contas = new ContaAbstrata[n];
        this.indice = 0;
    }

    public void inserir(ContaAbstrata c){
        contas[indice] = c;
        indice++;
    }

    public ContaAbstrata procurar(String numero){
        boolean achou = false;
        for(int i=0;i<indice;i++){
            if(contas[i].getNumero().equals(numero))
                achou=true;
                return contas[i];
        }
        if(!achou){
            throw new RuntimeException("Not found");
        }
        return null;
    }

    public void remover(String numero){
        boolean achou = false;
        for (int i=0;i<indice;i++){
            if(contas[i].getNumero().equals(numero)){
                achou = true;
            }
            if(achou && i+1<indice){
                contas[i] = contas[i+1];
            }
        }
        if(achou){
            indice--; 
            contas[indice] = null;
        }
    }

    public void atualizar(ContaAbstrata conta, String numero){
        ContaAbstrata c = procurar(conta.getNumero());
        c.setNumero(numero);
    }

    public boolean existe(String numero){
        boolean achou = false;
        for (int i=0;i<indice;i++){
            if(contas[i].getNumero().equals(numero)){
                achou = true;
            }
        }
        return achou;
    }
}