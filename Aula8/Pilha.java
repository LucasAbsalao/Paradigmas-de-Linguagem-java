public class Pilha <T>{
    private int max, topo;
    private T[] elementos;

    public Pilha(int max){
        topo = -1;
        this.max = max;
        elementos = ( T[] ) new Object[max];
    }

    public void push(T element) throws Error{
        if(topo<max-1) elementos[++topo] = element;
        else throw new Error();
    }

    public T pop() throws Error{
        if(topo>=0){
            return elementos[topo--];
        } 
        else throw new Error();
    }
}
/*
 1) 24
 2) 7
 3) 9
 4) 7
 5 )
 */