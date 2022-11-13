package relatorios;

import java.util.Scanner;

import static metodos.MetodosAlunos.listaDeAlunos;
import static metodos.MetodosPedagogos.listaDePedagogos;
import static metodos.MetodosProfessores.listaDeProfessores;

public class RelatorioGeral {

    public static void relatorioGeral(Scanner entrada) {
        if (listaDeProfessores.size() == 0) {
            System.out.println("\nNenhum professor encontrado.");
        } else {
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                System.out.println("\nID professor(a): " + listaDeProfessores.get(i).getIdentificador()
                        + "\nNome professor(a): " + listaDeProfessores.get(i).getNome()
                        + "\nCPF professor(a): " + listaDeProfessores.get(i).getCpf());
            }
        }
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNenhum aluno encontrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                System.out.println("\nID aluno(a): " + listaDeAlunos.get(i).getIdentificador()
                        + "\nNome aluno(a): " + listaDeAlunos.get(i).getNome()
                        + "\nCPF aluno(a): " + listaDeAlunos.get(i).getCpf());
            }
        }

        if (listaDePedagogos.size() == 0) {
            System.out.println("\nNenhum pedagogo encontrado");
        } else {
            for (int i = 0; i < listaDePedagogos.size(); i++) {
                System.out.println("\nID pedagogo(a): " + listaDePedagogos.get(i).getIdentificador()
                        + "\nNome pedagog(a): " + listaDePedagogos.get(i).getNome()
                        + "\nCPF pedagogo(a): " + listaDePedagogos.get(i).getCpf());
            }
        }
    }

    public static void relatorioGeralProf(Scanner entrada) {
        if (listaDeProfessores.size() == 0) {
            System.out.println("\nNenhum professor encontrado.");
        } else {
            for (int i = 0; i < listaDeProfessores.size(); i++) {
                System.out.println("\nID professor(a): " + listaDeProfessores.get(i).getIdentificador()
                        + "\nNome professor(a): " + listaDeProfessores.get(i).getNome()
                        + "\nCPF professor(a): " + listaDeProfessores.get(i).getCpf());
            }
        }
    }

    public static void relatorioGeralAlunos(Scanner entrada) {
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNenhum aluno encontrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                System.out.println("\nID aluno(a): " + listaDeAlunos.get(i).getIdentificador()
                        + "\nNome aluno(a): " + listaDeAlunos.get(i).getNome()
                        + "\nCPF aluno(a): " + listaDeAlunos.get(i).getCpf());
            }
        }
    }

    public static void relatorioGeralPedagogos(Scanner entrada) {
        if (listaDePedagogos.size() == 0) {
            System.out.println("\nNenhum pedagogo encontrado.");
        } else {
            for (int i = 0; i < listaDePedagogos.size(); i++) {
                System.out.println("\nID pedagogo(a): " + listaDePedagogos.get(i).getIdentificador()
                        + "\nNome pedagogo(a): " + listaDePedagogos.get(i).getNome()
                        + "\nCPF pedagogo(a): " + listaDePedagogos.get(i).getCpf());
            }
        }
    }
}
