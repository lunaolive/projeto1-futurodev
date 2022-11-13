package menus;

import java.util.Scanner;

import static relatorios.RelatorioAlunos.*;
import static relatorios.RelatorioGeral.*;
import static relatorios.RelatorioPedagogos.relatoPedagogoMaisAtendimento;
import static relatorios.RelatorioPedagogos.relatorioPedagogos;
import static relatorios.RelatorioProfessores.*;

public class MenuRelatorio {

    public static void menuRelatorio(Scanner entrada) {
        int opcao1;
        do {
            System.out.println("----------------------------------");
            System.out.println("       MENU DE RELATÓRIOS         ");
            System.out.println("----------------------------------");
            System.out.println("\nSelecione o relatório que deseja acessar:");
            System.out.println("1 - Relatório de alunos");
            System.out.println("2 - Relatório de professores");
            System.out.println("3 - Relatório de pedagogos");
            System.out.println("4 - Relatório de aluno mais atendido");
            System.out.println("5 - Relatório de pedagogo com mais atendimento");
            System.out.println("6 - Relatório geral");
            System.out.println("0 - Voltar ao menu inicial");
            opcao1 = entrada.nextInt();
            entrada.nextLine();

            switch (opcao1) {
                case 1:
                    MenuRelatorio.RelatorioAlunos(entrada);
                    break;
                case 2:
                    MenuRelatorio.RelatorioProfessores(entrada);
                    break;
                case 3:
                    relatorioPedagogos(entrada);
                    break;
                case 4:
                    relatoAlunoMaisAtendimento(entrada);
                    break;
                case 5:
                    relatoPedagogoMaisAtendimento(entrada);
                    break;
                case 6:
                    menuRelatorioGeral(entrada);
                    break;
                case 0:
                    System.out.println("\nFim da execução do menu de relatórios.");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        } while (opcao1 != 0);
    }

    public static void RelatorioAlunos(Scanner entrada) {
        int opcao1;
        do {
            System.out.println("------------------------------------------");
            System.out.println("       MENU DE RELATÓRIOS DE ALUNOS        ");
            System.out.println("-------------------------------------------");
            System.out.println("\nSelecione o relatório que deseja acessar:");
            System.out.println("1 - Relatório de alunos ativos");
            System.out.println("2 - Relatório de alunos irregulares");
            System.out.println("3 - Relatório de alunos em atendimento pedagógico");
            System.out.println("4 - Relatório de alunos em inativos");
            System.out.println("5 - Relatório de todos os alunos");
            System.out.println("0 - Voltar ao menu inicial");
            opcao1 = entrada.nextInt();
            entrada.nextLine();

            switch (opcao1) {
                case 1:
                    relatoAlunosAtivos(entrada);
                    break;
                case 2:
                    relatoAlunosIrregulares(entrada);
                    break;
                case 3:
                    relatoAlunosAtendPedag(entrada);
                    break;
                case 4:
                    relatoAlunosInativos(entrada);
                    break;
                case 5:
                    relatorioAlunos(entrada);
                    break;
                case 0:
                    System.out.println("\nFim da execução de relatórios de alunos.");
                    break;
                default:
                    System.out.println("\n Opção inválida.");
            }
        } while (opcao1 != 0);
    }

    public static void RelatorioProfessores(Scanner entrada) {
        int opcao1;
        do {
            System.out.println("------------------------------------------");
            System.out.println("       MENU DE RELATÓRIOS DE PROFESSORES        ");
            System.out.println("-------------------------------------------");
            System.out.println("\nSelecione o relatório que deseja acessar:");
            System.out.println("1 - Relatório de professores (Front-End)");
            System.out.println("2 - Relatório de professores (Back-End)");
            System.out.println("3 - Relatório de professores (Full-Stack)");
            System.out.println("4 - Relatório geral de professores");
            System.out.println("0 - Voltar ao menu inicial");
            opcao1 = entrada.nextInt();
            entrada.nextLine();

            switch (opcao1) {
                case 1:
                    relatoProfFrontEnd(entrada);
                    break;
                case 2:
                    relatoProfBackEnd(entrada);
                    break;
                case 3:
                    relatoProfFullStack(entrada);
                    break;
                case 4:
                    relatorioProfessores(entrada);
                    break;
                case 0:
                    System.out.println("\nFim da execução de relatórios de professores.");
                    break;
                default:
                    System.out.println("\n Opção inválida.");
            }
        } while (opcao1 != 0);
    }

    public static void menuRelatorioGeral(Scanner entrada) {
        int opcao1;
        do {
            System.out.println("----------------------------------");
            System.out.println("       MENU DE RELATÓRIOS GERAIS      ");
            System.out.println("----------------------------------");
            System.out.println("\nSelecione o relatório que deseja acessar:");
            System.out.println("1 - Relatório geral de alunos");
            System.out.println("2 - Relatório geral de professores");
            System.out.println("3 - Relatório geral de pedagogos");
            System.out.println("4 - Relatório geral (todos)");
            System.out.println("0 - Voltar ao menu inicial");
            opcao1 = entrada.nextInt();
            entrada.nextLine();

            switch (opcao1) {
                case 1:
                    relatorioGeralAlunos(entrada);
                    break;
                case 2:
                    relatorioGeralProf(entrada);
                    break;
                case 3:
                    relatorioGeralPedagogos(entrada);
                    break;
                case 4:
                    relatorioGeral(entrada);
                    break;
                case 0:
                    System.out.println("\nFim da execução do menu de relatórios gerais.");
                    break;
                default:
                    System.out.println("\n Opção inválida.");
            }
        } while (opcao1 != 0);
    }
}
