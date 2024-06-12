public class TestaAluno{
    public static void main(String[] args){
        Curso curso = new Curso(678, "PLC");
        Aluno apsbpc = new Aluno();
        System.out.println(apsbpc.getNome());
        System.out.println(apsbpc.getCpf());
        System.out.println(apsbpc.getIdade());
        apsbpc.getCurso().printCurso();
        apsbpc.setAluno("Ana", "71347467475", 20, curso);
        System.out.println(apsbpc.getNome());
        System.out.println(apsbpc.getCpf());
        System.out.println(apsbpc.getIdade());
        apsbpc.getCurso().printCurso();
        ContaGerador contaQuinhas = new ContaGerador(10000000);
        ContaGerador contaApspspspsps = new ContaGerador(1000.50);
        ContaGerador contaLuan = new ContaGerador(1.99); //Pobre, pega onibus

        contaApspspspsps.printConta();
        contaLuan.printConta();
        contaQuinhas.printConta();
    }
}