package relatorios;

import metodos.MetodosProfessores;
import java.util.Scanner;

import static metodos.MetodosProfessores.listaDeProfessores;

public class RelatorioProfessores {

    public static void relatorioProfessores(Scanner entrada) {
        if (listaDeProfessores.size() == 0) {
            System.out.println("\nNenhum professor encontrado.");
        } else {
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                MetodosProfessores.listarProfessor();
            }
        }
    }

    // MÉTODO INVOCAÇÃO DE RELATÓRIO PROFESSORES FRONT-END
    public static void relatoProfFrontEnd(Scanner entrada) {

        int cont = 0;
        if (listaDeProfessores.size() == 0) {
            System.out.println("\nNenhum professor encontrado.");
        } else {
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                if (listaDeProfessores.get(i).getExperienciaDev() == 1) {
                    cont++;
                    System.out.println("\nINFORMAÇÕES DOS PROFESSORES COM EXPERIÊNCIA EM FRONT-END:");
                    System.out.println("\nID do(a) professor(a): " + listaDeProfessores.get(i).getIdentificador()
                            + "\nNome do(a) professor(a): " + listaDeProfessores.get(i).getNome()
                            + ".");
                }
            }
            if (cont == 0) {
                System.out.println("\nNenhum professor com experiência em Front-End foi encontrado.");
            }
        }
    }

    // MÉTODO INVOCAÇÃO DE RELATÓRIO PROFESSORES BACK-END
    public static void relatoProfBackEnd(Scanner entrada) {

        int cont = 0;
        if (listaDeProfessores.size() == 0) {
            System.out.println("\nNenhum professor encontrado.");
        } else {
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                if (listaDeProfessores.get(i).getExperienciaDev() == 2) {
                    cont++;
                    System.out.println("\nINFORMAÇÕES DOS PROFESSORES COM EXPERIÊNCIA EM BACK-END:");
                    System.out.println("\nID do(a) professor(a): " + listaDeProfessores.get(i).getIdentificador()
                            + "\nNome do(a) professor(a): " + listaDeProfessores.get(i).getNome()
                            + ".");
                }
            }
            if (cont == 0) {
                System.out.println("\nNenhum professor com experiência em Back-End foi encontrado.");
            }
        }
    }

    // MÉTODO INVOCAÇÃO DE RELATÓRIO PROFESSORES FULL-STACK
    public static void relatoProfFullStack(Scanner entrada) {

        int cont = 0;
        if (listaDeProfessores.size() == 0) {
            System.out.println("\nNenhum professor encontrado.");
        } else {
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                if (listaDeProfessores.get(i).getExperienciaDev() == 3) {
                    cont++;
                    System.out.println("\nINFORMAÇÕES DOS PROFESSORES COM EXPERIÊNCIA EM FULL-STACK:");
                    System.out.println("\nID do(a) professor(a): " + listaDeProfessores.get(i).getIdentificador()
                            + "\nNome do(a) professor(a): " + listaDeProfessores.get(i).getNome()
                            + ".");
                }
            }
            if (cont == 0) {
                System.out.println("\nNenhum professor com experiência em Full-Stack foi encontrado.");
            }
        }
    }
}
