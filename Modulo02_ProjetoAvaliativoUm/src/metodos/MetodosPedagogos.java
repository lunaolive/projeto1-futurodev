package metodos;

import models.Pedagogo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosPedagogos {

    // CRIAÇÃO DA LISTA DE PEDAGOGOS

    public static List<Pedagogo> listaDePedagogos = new ArrayList<>();

    public static void adicionaPedagogo(Pedagogo pedagogoNovo) {
        listaDePedagogos.add(pedagogoNovo);
    }

    public static void listarPedagogo() {
        System.out.println("\nLista de pedagogos: ");
        for (Pedagogo pedagogoListado : listaDePedagogos) {
            System.out.println(pedagogoListado.toString());
        }
    }
    public static int localPedagogo(List<Pedagogo> listaDePedagogos, int identificador) {
        for (int i = 0; i < listaDePedagogos.size(); i++) {
            if (listaDePedagogos.get(i).getIdentificador() == identificador) {
                return i;
            }
        }
        return -1;
    }
    // MÉTODO DE CADASTRO DO PEDAGOGO

    public static void cadastraPedagogo(Scanner entrada1) {

        System.out.println("Digite o nome do(a) pedagogo(a): ");
        String nome = entrada1.nextLine();

        System.out.println("Digite o número de telefone do(a) pedagogo(a): ");
        String telefone = entrada1.nextLine();

        System.out.println("Digite o CPF do(a) pedagogo(a): ");
        String cpf = entrada1.nextLine();

        System.out.println("Informe a data de nascimento do(a) pedagogo(a): ");
        String dataNascimento = entrada1.nextLine();

        System.out.println("Pedagogo(a) cadastrado com sucesso!");
        System.out.println();

        Pedagogo pedagogoUm = new Pedagogo(nome, telefone, dataNascimento, cpf, 0);
        adicionaPedagogo(pedagogoUm);
    }
}
