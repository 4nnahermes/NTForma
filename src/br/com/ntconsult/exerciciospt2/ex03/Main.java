package br.com.ntconsult.exerciciospt2.ex03;

import java.util.Scanner;

import static br.com.ntconsult.exerciciospt2.ex03.CifraDeVigenere.criptografar;
import static br.com.ntconsult.exerciciospt2.ex03.CifraDeVigenere.descriptografar;

// 3. Implemente a cifra de Vigenère para criptografar e descriptografar uma mensagem.
public class Main {
    public static void main(String[] args) {
        boolean finalizar = false;

        while (!finalizar) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite uma palavra ou mensagem: ");
            String mensagem = leitor.nextLine().toUpperCase();
            System.out.println("Digite a palavra chave: ");
            String chave = leitor.nextLine().toUpperCase();

            System.out.println("--------MENU-------\n1. Criptografar\n2. Descriptografar\n3. Finalizar\nEscolha uma opção: ");
            int escolha;
            try {
                escolha = leitor.nextInt();
            } catch (Exception e) {
                System.out.println("Comando inválido\n");
                continue;
            }

            if (escolha == 1) {
                criptografar(mensagem, chave);
                System.out.println("\n[1] Sair | [2] Continuar ");

                int opcao;
                try {
                    opcao = leitor.nextInt();
                } catch (Exception e) {
                    System.out.println("Comando inválido\n");
                    continue;
                }

                if (opcao == 1) {
                    break;
                } else if (opcao == 2) {
                    continue;
                } else {
                    System.out.println("Comando inválido\n");
                    continue;
                }
            } else if (escolha == 2) {
                descriptografar(mensagem, chave);
                System.out.println("[1] Sair | [2] Continuar");
                int opcao = leitor.nextInt();
                if (opcao == 1) {
                    break;
                } else if (opcao == 2) {
                    continue;
                } else {
                    System.out.println("Comando inválido\n");
                    continue;
                }
            } else if (escolha == 3) {
                finalizar = true;
                break;
            } else {
                System.out.println("Comando inválido\n");
                continue;
            }
        }
    }
}
