package relatorios;

import metodos.MetodosAlunos;

import java.util.Scanner;

import static metodos.MetodosAlunos.listaDeAlunos;

public class RelatorioAlunos {

    // RELATÓRIO TODOS OS ALUNOS
    public static void relatorioAlunos(Scanner entrada) {
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNenhum aluno encontrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                MetodosAlunos.listarAlunos();
            }
        }
    }

    // MÉTODO INVOCAÇÃO RELATÓRIO DE ALUNOS ATIVOS
    public static void relatoAlunosAtivos(Scanner entrada) {

        int cont = 0;
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNenhum aluno encontrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                if (listaDeAlunos.get(i).getStatusMatricula() == 1) {
                    cont++;
                    System.out.println("\nINFORMAÇÕES DOS ALUNOS ATIVOS:");
                    System.out.println("\nID do(a) aluno(a): " + listaDeAlunos.get(i).getIdentificador()
                            + "\nNome do(a) aluno(a): " + listaDeAlunos.get(i).getNome()
                            + "\nNota do processo seletivo: " + listaDeAlunos.get(i).getNotaProcessoSeletivo()
                            + "\nNº de atendimentos pedagógicos: " + listaDeAlunos.get(i).getQtdAtendimentosPedag()
                            + ".");
                }
            }
            if (cont == 0) {
                System.out.println("\nNenhum aluno com matrícula ativa foi encontrado.");
            }
        }
    }

    // MÉTODO INVOCAÇÃO RELATÓRIO DE ALUNOS IRREGULARES
    public static void relatoAlunosIrregulares(Scanner entrada) {

        int cont = 0;
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNenhum aluno encontrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                if (listaDeAlunos.get(i).getStatusMatricula() == 2) {
                    cont++;
                    System.out.println("\nINFORMAÇÕES DOS ALUNOS IRREGULARES:");
                    System.out.println("\nID do(a) aluno(a): " + listaDeAlunos.get(i).getIdentificador()
                            + "\nNome do(a) aluno(a): " + listaDeAlunos.get(i).getNome()
                            + "\nNota do processo seletivo: " + listaDeAlunos.get(i).getNotaProcessoSeletivo()
                            + "\nNº de atendimentos pedagógicos: " + listaDeAlunos.get(i).getQtdAtendimentosPedag()
                            + ".");
                }
            }
            if (cont == 0) {
                System.out.println("\nNenhum aluno com matrícula irregular foi encontrado.");
            }
        }
    }

    // MÉTODO INVOCAÇÃO RELATÓRIO DE ALUNOS EM ATENDIMENTO PEDAGÓGICO
    public static void relatoAlunosAtendPedag(Scanner entrada) {

        int cont = 0;
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNenhum aluno encontrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                if (listaDeAlunos.get(i).getStatusMatricula() == 3) {
                    cont++;
                    System.out.println("\nINFORMAÇÕES DOS ALUNOS EM ATENDIMENTO PEDAGÓGICO:");
                    System.out.println("\nID do(a) aluno(a): " + listaDeAlunos.get(i).getIdentificador()
                            + "\nNome do(a) aluno(a): " + listaDeAlunos.get(i).getNome()
                            + "\nNota do processo seletivo: " + listaDeAlunos.get(i).getNotaProcessoSeletivo()
                            + "\nNº de atendimentos pedagógicos: " + listaDeAlunos.get(i).getQtdAtendimentosPedag()
                            + ".");
                }
            }
            if (cont == 0) {
                System.out.println("\nNenhum aluno com matrícula em atendimento pedagógico foi encontrado.");
            }
        }
    }

    // MÉTODO INVOCAÇÃO RELATÓRIO DE ALUNOS EM ATENDIMENTO PEDAGÓGICO
    public static void relatoAlunosInativos(Scanner entrada) {

        int cont = 0;
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNenhum aluno encontrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                if (listaDeAlunos.get(i).getStatusMatricula() == 4) {
                    cont++;
                    System.out.println("\nINFORMAÇÕES DOS ALUNOS INATIVOS:");
                    System.out.println("\nID do(a) aluno(a): " + listaDeAlunos.get(i).getIdentificador()
                            + "\nNome do(a) aluno(a): " + listaDeAlunos.get(i).getNome()
                            + "\nNota do processo seletivo: " + listaDeAlunos.get(i).getNotaProcessoSeletivo()
                            + "\nNº de atendimentos pedagógicos: " + listaDeAlunos.get(i).getQtdAtendimentosPedag()
                            + ".");
                }
            }
            if (cont == 0) {
                System.out.println("\nNenhum aluno com matrícula inativa foi encontrado.");
            }
        }
    }

    // RELATÓRIO DE ALUNO COM MAIS ATENDIMENTO
    public static void relatoAlunoMaisAtendimento(Scanner entrada) {
        int alunoMaisAtendimento = -1;
        int qtdAtend = 0;
        if (listaDeAlunos.size() == 0) {
            System.out.println("\nNão há nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                if (listaDeAlunos.get(i).getQtdAtendimentosPedag() > qtdAtend) {
                    qtdAtend = listaDeAlunos.get(i).getQtdAtendimentosPedag();
                    alunoMaisAtendimento = i;
                }
            }
            if (alunoMaisAtendimento == -1) {
                System.out.println("\nNão há registro de nenhum aluno com atendimento pedagógico.");
            } else {
                System.out.println("\nID do(a) aluno(a):"
                        + listaDeAlunos.get(alunoMaisAtendimento).getIdentificador()
                + "\nNome do(a) aluno(a)" + listaDeAlunos.get(alunoMaisAtendimento).getNome()
                + ".");
            }
        }
    }
}

