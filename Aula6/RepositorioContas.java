public interface RepositorioContas{
    void inserir (ContaAbstrata conta);
    ContaAbstrata procurar(String numero);
    void remover(String numero);
    void atualizar(ContaAbstrata conta, String numero);
    boolean existe(String numero);
}