public class Aluno{
    private String nome;
    private String cpf;
    private int idade;
    private Curso curso;


    public Aluno(String nome, String cpf, int idade, Curso curso){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.curso = curso;
    } 

    public Aluno(){
        this.nome = "Vazio";
        this.cpf = "Vazio";
        this.idade = 0;
        this.curso = new Curso(0,"Sem curso");
    }
    public void setAluno(String nome, String cpf, int idade, Curso curso){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public Curso getCurso(){
        return curso;
    }
}