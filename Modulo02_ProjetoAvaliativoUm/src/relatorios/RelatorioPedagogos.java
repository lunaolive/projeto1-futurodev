package relatorios;

import metodos.MetodosPedagogos;

import java.util.Scanner;
import static metodos.MetodosPedagogos.listaDePedagogos;

public class RelatorioPedagogos {

    public static void relatorioPedagogos(Scanner entrada) {
        if (listaDePedagogos.size() == 0) {
            System.out.println("\nNenhum pedagogo encontrado.");
        } else {
            for (int i = 0; i < listaDePedagogos.size(); i++) {
                MetodosPedagogos.listarPedagogo();
            }
        }
    }

    // RELATÓRIO DE PEDAGOGO COM MAIS ATENDIMENTO
    public static void relatoPedagogoMaisAtendimento(Scanner entrada) {
        int pedagogoMaisAtendimento = -1;
        int qtdAtend = 0;
        if (listaDePedagogos.size() == 0) {
            System.out.println("\nNão há nenhum pedagogo cadastrado.");
        } else {
            for (int i = 0; i < listaDePedagogos.size(); i++) {
                if (listaDePedagogos.get(i).getQtdAtendimentosPedag() > qtdAtend) {
                    qtdAtend = listaDePedagogos.get(i).getQtdAtendimentosPedag();
                    pedagogoMaisAtendimento = i;
                }
            }
            if (pedagogoMaisAtendimento == -1) {
                System.out.println("\nNão há registro de nenhum pedagogo com atendimento pedagógico.");
            } else {
                System.out.println("\nID do(a) pedagogo(a):"
                        + listaDePedagogos.get(pedagogoMaisAtendimento).getIdentificador()
                        + "\nNome do(a) pedagogo(a)" + listaDePedagogos.get(pedagogoMaisAtendimento).getNome()
                        + ".");
            }
        }
    }
}