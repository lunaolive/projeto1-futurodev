package models;

public class Aluno extends Pessoa {

    private int statusMatricula;
    private double notaProcessoSeletivo;
    protected int qtdAtendimentosPedag;

    public Aluno(String nome, String telefone, String dataNascimento, String cpf, int statusMatricula, double nota) {
        super(nome, telefone, dataNascimento, cpf);
        this.notaProcessoSeletivo = nota;
        this.statusMatricula = statusMatricula;
    }

    public int getStatusMatricula() {
    return statusMatricula;
    }

    public void setStatusMatricula(int statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public double getNotaProcessoSeletivo() {
        return notaProcessoSeletivo;
    }

    public int getQtdAtendimentosPedag() {
        return qtdAtendimentosPedag;
    }

    public void incrementoAtendPedag() {
        this.qtdAtendimentosPedag++;
    }


    @Override
    public String toString() {
        return "\nCódigo: " + super.identificador + "\nAluno(a): " + super.nome
                + "\nNota do Processo Seletivo: " + this.notaProcessoSeletivo
                + "\nNº atendimentos pedagógicos: " + this.qtdAtendimentosPedag;
    }
}
