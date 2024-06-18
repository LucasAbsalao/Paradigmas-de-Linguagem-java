public class Main{
    public static void main(String[] args){
        Poupanca p1 = new Poupanca("1");
        System.out.println(p1.getNumero());
        Conta c = new Conta("2");
        c.creditar(20.3);
        Conta c1 = new Conta("3");
        Conta c2 = new Conta("4");
        Conta c3 = new Conta("5");
        
        
        Banco b1 = new Banco();
        b1.cadastrar(c);
        b1.cadastrar(c1);
        b1.cadastrar(c2);
        b1.cadastrar(c3);
        System.out.println(b1.getSaldo(0));
    }
}