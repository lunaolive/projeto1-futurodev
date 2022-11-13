package menus;

import metodos.MetodosAlunos;
import metodos.MetodosAtendimentos;
import metodos.MetodosPedagogos;
import metodos.MetodosProfessores;

import java.util.Scanner;

public class MenuOpcoes {

    public static void menu(Scanner entrada) {

                           // OPÇÃO DE CADASTRO GERAL
        int opcao1 = 0;
        do {
            System.out.println("\n----------------------------------");
            System.out.println("Bem-vindo(a) ao Programa LabSchool!");
            System.out.println("----------------------------------");
            System.out.println("              MENU                 ");
            System.out.println("----------------------------------");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Cadastrar aluno(a)");
            System.out.println("2 - Alterar status de matrícula do(a) aluno(a)");
            System.out.println("3 - Cadastrar professor(a)");
            System.out.println("4 - Cadastrar pedagogo(a)");
            System.out.println("5 - Cadastrar atendimento pedagógico");
            System.out.println("6 - Relatórios");
            System.out.println("0 - Sair");
            opcao1 = entrada.nextInt();
            entrada.nextLine();

            switch (opcao1) {
                case 1:
                    MetodosAlunos.cadastraAluno(entrada);
                    break;
                case 2:
                    MetodosAlunos.alteraCadastro(entrada);
                    break;
                case 3:
                    MetodosProfessores.cadastraProfessor(entrada);
                    break;
                case 4:
                    MetodosPedagogos.cadastraPedagogo(entrada);
                    break;
                case 5:
                    MetodosAtendimentos.cadastraAtendimento(entrada);
                    break;
                case 6:
                    MenuRelatorio.menuRelatorio(entrada);
                    break;
                case 0:
                    System.out.println("\nFim da execução do programa LabSchool." +
                            "\nO programa LabSchool foi desenvolvido por Luna D.A. Oliveira");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        } while (opcao1 != 0);
    }
}

