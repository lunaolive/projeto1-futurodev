package metodos;

import models.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosProfessores {

    // CRIAÇÃO DA LISTA DE PROFESSORES

    public static List<Professor> listaDeProfessores = new ArrayList<>();

    public static void adicionaProfessor(Professor professorNovo) {
        listaDeProfessores.add(professorNovo);
    }

    public static void listarProfessor() {
        System.out.println("\nLista de professores: ");
        for (Professor professorListado : listaDeProfessores) {
            System.out.println(professorListado.toString());
        }
    }

    // MÉTODO DE CADASTRO DO PROFESSOR


    public static void cadastraProfessor(Scanner entrada) {

        System.out.println("\nDigite o nome do(a) professor(a): ");
        String nome = entrada.nextLine();

        System.out.println("\nDigite o número de telefone do(a) professor(a): ");
        String telefone = entrada.nextLine();

        System.out.println("\nDigite o CPF do(a) professor(a): ");
        String cpf = entrada.nextLine();

        System.out.println("\nInforme a data de nascimento do(a) professor(a): ");
        String dataNascimento = entrada.nextLine();

        System.out.println("\nQual a formação acadêmica do(a) professor(a)?" +
                "\n 1 - Graduação incompleta; 2 - Graduação completa; 3 - Mestrado; 4 - Doutorado");
        int formacaoAcademica = Integer.parseInt(entrada.nextLine());

        System.out.println("\nQual tipo de experiência o(a) professor(a) possui em desenvolvimento?"
        + "\n1 - Front-End; 2 - Back-End; 3 - Full-Stack");
        int experienciaDev = Integer.parseInt(entrada.nextLine());

        System.out.println("\nO status do(a) professor(a) se encontra ativo? \nResponder sim/nao");
        boolean estadoAtivo = true;
        if (entrada.nextLine().toLowerCase() == "sim") {
            estadoAtivo = true;
        } else {
            estadoAtivo = false;
        }
        System.out.println("\nProfessor(a) cadastrado com sucesso!");
        System.out.println();

        Professor professorUm = new Professor(nome, telefone, dataNascimento, cpf,
                formacaoAcademica, experienciaDev, estadoAtivo);
        adicionaProfessor(professorUm);
    }
}
