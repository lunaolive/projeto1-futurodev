package metodos;

import java.util.Scanner;

import static metodos.MetodosAlunos.listaDeAlunos;
import static metodos.MetodosPedagogos.listaDePedagogos;

public class MetodosAtendimentos {

    // CADASTRO DE ATENDIMENTO PEDAGÓGICO

    public static void cadastraAtendimento(Scanner entrada1) {
        int idPedagogo;
        int idAluno;
        System.out.println("\n------------------------------------------------");
        System.out.println("Bem-vindo(a) ao cadastro de atendimento pedagógico");
        System.out.println("--------------------------------------------------");

        System.out.println("Digite o identificador do(a) pedagogo(a) que realizou o atendimento:");
        idPedagogo = Integer.parseInt(entrada1.nextLine());
        int localPedagogo = MetodosPedagogos.localPedagogo(listaDePedagogos, idPedagogo);
        if (localPedagogo == -1) {
            System.out.println("Identificador do pedagogo não encontrado.");
        } else {
            System.out.println("Digite o identificador do(a) aluno(a) que recebeu atendimento:");
            idAluno = Integer.parseInt(entrada1.nextLine());
            int localAluno = MetodosAlunos.localAluno(listaDeAlunos, idAluno);
            if (localAluno == -1) {
                System.out.println("Identificador do aluno não encontrado.");
            } else {
                System.out.println("Atendimento cadastrado com sucesso!");
                System.out.println();
                listaDePedagogos.get(localPedagogo).incrementoAtendPedag();
                listaDeAlunos.get(localAluno).incrementoAtendPedag();
            }
        }
    }
}
