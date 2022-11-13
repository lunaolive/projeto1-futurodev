package models;

public class Pedagogo extends Pessoa {

    protected int qtdAtendimentosPedag;

    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf, int qtdAtendimentosPedag) {
        super(nome, telefone, dataNascimento, cpf);
        this.qtdAtendimentosPedag = qtdAtendimentosPedag;
    }

    public int getQtdAtendimentosPedag() {
        return qtdAtendimentosPedag;
    }

    public void incrementoAtendPedag() {
        this.qtdAtendimentosPedag++;
    }

    @Override
    public String toString() {
        return "\nCódigo: " + super.identificador + "\nPedagogo(a): " + super.nome
                + "\nCPF: " + super.cpf
                + "\nNúmero total de atendimentos: " + qtdAtendimentosPedag;
    }
}



