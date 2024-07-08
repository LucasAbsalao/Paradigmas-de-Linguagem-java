public class Teste{
    public static <T> void imprimeVetor(T vector[]){
        for (T v:vector) System.out.printf(v + " ");
        System.out.println();
    }
    public static void main( String args[]){
        Double[] arrayDouble = {1.1,2.2,3.3,4.4,5.5};
        System.out.println("Vetor de doubles:");
        imprimeVetor(arrayDouble);

        Integer[] arrayInteger = {1,2,3,4,5,6};
        System.out.println("vetor de Integer: ");
        imprimeVetor(arrayInteger);

        int a = 5;
        int b = 6;
        Par<Integer> par1 = new Par<Integer>(a,b);
        System.out.println(par1.toString());

        Pilha<Par<Integer>> p = new Pilha<Par<Integer>>(2);
        p.push(new Par<Integer>(2,3));
        p.push(new Par<Integer>(5,6));
        Par<Integer> pair;
        pair = p.pop();
        pair.toString();
        pair = p.pop();
        pair.toString();
        p.push(new Par<Integer>(4,6));
        pair = p.pop();
        pair.toString();

    }
}