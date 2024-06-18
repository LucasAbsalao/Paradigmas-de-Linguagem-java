public class Main{
    public static void main(String args[]){
        Conta ana = new Conta("71347467475", 24.24);
        Conta teste2 = new Conta();
        ana.creditar(30);
        System.out.println(teste2.getSaldo());
        Produto esnupi = new Produto("Esnupi", 100);
        ana.compraProduto(esnupi);
        System.out.println(ana.getSaldo());
    }
}