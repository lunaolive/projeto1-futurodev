package metodos;

import models.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosAlunos {

    // CRIAÇÃO DA LISTA DE ALUNOS

    public static List<Aluno> listaDeAlunos = new ArrayList<>();

    // MÉTODO PARA ADICIONAR ALUNO À LISTA
    public static void adicionaAluno(Aluno alunoNovo) {
        listaDeAlunos.add(alunoNovo);
    }

    // MÉTODO PARA LISTAR ALUNOS

    public static void listarAlunos() {
        System.out.println("\n Lista de alunos: ");
        for (Aluno alunoListado : listaDeAlunos) {
            System.out.println(alunoListado.toString());
            System.out.println();
        }
    }
    // MÉTODO DE CADASTRO DO ALUNO

    public static void cadastraAluno(Scanner entrada1) {

        System.out.println("\nDigite o nome do(a) aluno(a): ");
        String nome = entrada1.nextLine();

        System.out.println("\nDigite o número de telefone do(a) aluno(a): ");
        String telefone = entrada1.nextLine();

        System.out.println("\nDigite o CPF do(a) aluno(a): ");
        String cpf = entrada1.nextLine();

        System.out.println("\nInforme a data de nascimento do(a) aluno(a): ");
        String dataNascimento = entrada1.nextLine();

        System.out.println("\nInforme o status da matrícula do(a) aluno(a):" +
                "\n1 - Ativa, 2 - Irregular, 3 - Atendimento Psicológico; 4 - Inativa ");
        int statusMatricula = Integer.parseInt(entrada1.nextLine());
        while (statusMatricula > 4 || statusMatricula < 1) {
            System.out.println("\nOpção inválida. Digite uma opção entre 1 e 4.");
            statusMatricula = Integer.parseInt(entrada1.nextLine());
        }
        System.out.println("\nDigite a nota do(a) aluno(a): ");
        double nota = Double.parseDouble(entrada1.nextLine());
        while (nota > 10 || nota < 0) {
            System.out.println("\nNota inválida. Digite uma nota entre 0 e 10.");
            nota = Double.parseDouble(entrada1.nextLine());
        }

        System.out.println("\nAluno(a) cadastrado com sucesso!");
        System.out.println();

        Aluno alunoUm = new Aluno(nome, telefone, dataNascimento, cpf, statusMatricula, nota);
        adicionaAluno(alunoUm);
    }

    //  MÉTODO DE ALTERAÇÃO DO STATUS DA MATRÍCULA DO ALUNO

    public static int localAluno(List<Aluno> listaDeAlunos, int identificador) {
        for (int i = 0; i < listaDeAlunos.size(); i++) {
            if (listaDeAlunos.get(i).getIdentificador() == identificador) {
                return i;
            }
        }
        return -1;
    }

    public static void alteraCadastro(Scanner entrada1) {
        System.out.println("\nDigite o identificador do aluno: ");
        int id = Integer.parseInt(entrada1.nextLine());
        int localAluno = localAluno(listaDeAlunos, id);
        if (localAluno == -1) {
            System.out.println("\nIdentificador inválido.");
        } else {
            System.out.println("\nEscolha a opção desejada para alterar o status da matrícula: ");
            System.out.println("1 - Ativa");
            System.out.println("2 - Irregular");
            System.out.println("3 - Atendimento pedagógico");
            System.out.println("4 - Inativa");
            int opcaoMatricula = Integer.parseInt(entrada1.nextLine());
            if (opcaoMatricula == 1) {
                listaDeAlunos.get(localAluno).setStatusMatricula(1);
                System.out.println("\nA matrícula foi alterada para ativa.");
            } else if (opcaoMatricula == 2) {
                listaDeAlunos.get(localAluno).setStatusMatricula(2);
                System.out.println("\nA matrícula foi alterada para irregular.");
            } else if (opcaoMatricula == 3) {
                listaDeAlunos.get(localAluno).setStatusMatricula(3);
                System.out.println("\nA matrícula foi alterada para atendimento pedagógico.");
            } else if (opcaoMatricula == 4) {
                listaDeAlunos.get(localAluno).setStatusMatricula(4);
                System.out.println("\nA matrícula foi alterada para inativa.");
            } else {
                System.out.println("\nNão foi possível alterar o status. Digite uma opção válida.");
            }
        }
    }
}
