package models;

public class Professor extends Pessoa {

    protected int formacaoAcademica;
    protected int experienciaDev;
    protected boolean estadoAtivo = true;

    public Professor(String nome, String telefone, String dataNascimento, String cpf,
                     int formacaoAcademica, int experienciaDev, boolean estadoAtivo) {
        super(nome, telefone, dataNascimento, cpf);
        this.formacaoAcademica = formacaoAcademica;
        this.experienciaDev = experienciaDev;
        this.estadoAtivo = estadoAtivo;
    }

    public int getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(int formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public int getExperienciaDev() {
        return experienciaDev;
    }

    public void setExperienciaDev(int experienciaDev) {
        this.experienciaDev = experienciaDev;
    }

    public boolean isEstadoAtivo() {
        return estadoAtivo;
    }

    public void setEstadoAtivo(boolean estadoAtivo) {
        this.estadoAtivo = estadoAtivo;
    }

    @Override
    public String toString() {
        return "\nCódigo: " + super.identificador + "\nProfessor(a): " + super.nome
                + "\nPossui experiência em: " +
                this.experienciaDev + ".";
    }
}
