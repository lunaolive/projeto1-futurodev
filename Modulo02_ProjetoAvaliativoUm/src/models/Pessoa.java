package models;

/*
Desenvolvido por: Luna Dias de Almeida Oliveira
 */
public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String dataNascimento;
    protected String cpf;
    public int identificador; // precisa ser gerado automaticamente pelo sistema
    protected static int totalDeCadastros;

    public Pessoa(String nome, String telefone, String dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.identificador = ++totalDeCadastros;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdentificador() {
        return identificador;
    }

    public static int getTotalDeCadastros() {
        return totalDeCadastros;
    }

    public String toString() {
        return "\nPessoa: " + this.nome + ", \nCódigo: " + this.identificador + "\nCPF: " + this.cpf + ".";
    }
}

