public class Produto{
    private String nome;
    private double preco;

    public Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    public void changePrice(double novoPreco){
        preco = novoPreco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

}