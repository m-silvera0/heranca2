public class Professor extends Funcionario{
    private String disciplina;

    public void setDiscipla(String discipla) {
        this.disciplina = discipla;
    }
    public String getDiscipla() {
        return disciplina;
    }
    public Professor (String nome, int idade, String endereco, double salario, String disciplina){
        super(nome, idade, endereco, salario);
        this.disciplina = disciplina;
    }
}
