package br.com.ntconsult.exerciciospt2.ex02;

import java.util.Scanner;

import static br.com.ntconsult.exerciciospt2.ex02.CifraDeCesar.criptografar;
import static br.com.ntconsult.exerciciospt2.ex02.CifraDeCesar.descriptografar;

// 2. Implemente a cifra de César para criptografar e descriptografar uma mensagem.
public class Main {
    public static void main(String[] args) {
        boolean finalizar = false;

        while (!finalizar) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite uma palavra ou mensagem: ");
            String entrada = leitor.nextLine();

            int chave;
            try {
                System.out.println("Digite um valor para a chave: ");
                chave = leitor.nextInt();
            } catch (Exception e) {
                System.out.println("Valor inválido de chave\n");
                continue;
            }

            System.out.println("--------MENU-------\n1. Criptografar\n2. Descriptografar\n3. Finalizar\nEscolha uma opção: ");
            int escolha;
            try {
                escolha = leitor.nextInt();
            } catch (Exception e) {
                System.out.println("Comando Inválido\n");
                continue;
            }

            String saida;
            if (escolha == 1) {
                saida = criptografar(entrada, chave);
                System.out.println("Descriptografado: " + entrada);
                System.out.println("Criptografado: " + saida);
                System.out.println("\n[1] Sair | [2] Continuar ");

                int opcao;
                try {
                    opcao = leitor.nextInt();
                } catch (Exception e) {
                    System.out.println("Comando Inválido\n");
                    continue;
                }

                if (opcao == 1) {
                    break;
                } else if (opcao == 2) {
                    continue;
                } else {
                    System.out.println("Comando Inválido\n");
                    continue;
                }
            } else if (escolha == 2) {
                saida = descriptografar(entrada, chave);
                System.out.println("Criptografado: " + entrada);
                System.out.println("Descriptografado: " + saida);
                System.out.println("[1] Sair | [2] Continuar");
                int opcao = leitor.nextInt();
                if (opcao == 1) {
                    break;
                } else if (opcao == 2) {
                    continue;
                } else {
                    System.out.println("Comando Inválido\n");
                    continue;
                }
            } else if (escolha == 3) {
                finalizar = true;
                break;
            } else {
                System.out.println("Comando Inválido\n");
                continue;
            }
        }
    }
}
