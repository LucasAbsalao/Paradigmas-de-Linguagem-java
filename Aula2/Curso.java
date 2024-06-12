public class Curso{
    private int codigo;
    private String nome;

    public Curso(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    } 
    
    public void setCurso(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void printCurso(){
        System.out.println(nome + " " + codigo);
    }

    public String getNome(){
        return nome;
    }
    public int getCodigo(){
        return codigo;
    }
}