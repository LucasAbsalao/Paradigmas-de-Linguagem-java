public class Teste1 {
    public static void main(String args[]) {
        Classe1 a = new Classe1();
        Classe1 b = new Classe2();
        Classe2 c = new Classe2();
        a.setX(5); b.setX(7); c.setX(3);
        a.setY(8); b.setY(4); c.setY(6);
        System.out.println("a.function = " + a.function());
        System.out.println("b.function = " + b.function());
        System.out.println("c.function = " + c.function());
        a = b;
        b = c;
        System.out.println("a.function = " + a.function());
        System.out.println("b.function = " + b.function());
    }
}