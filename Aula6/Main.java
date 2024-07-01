public class Main {
  public static void main(String[] args) {
//    Conta conta;

    Banco banco;
    banco = new Banco();

    banco.cadastrarConta(new Poupanca("32.234-4"));
    banco.cadastrarConta(new Conta("47.465-2"));

    banco.creditarConta("32.234-4", 200.00); 
    banco.creditarConta("47.465-2", 200.00); 

    banco.debitarConta("32.234-4", 100.00); 
    banco.debitarConta("47.465-2", 100.00); 

    banco.renderJuros("32.234-4"); 
    banco.renderJuros("47.465-2"); 

    System.out.print("saldo da conta 32.234-4 = ");
    System.out.println(banco.procurarConta("32.234-4").getSaldo());
    System.out.print("saldo da conta 47.465-2 = ");
    System.out.println(banco.procurarConta("47.465-2").getSaldo());
  } 
}
