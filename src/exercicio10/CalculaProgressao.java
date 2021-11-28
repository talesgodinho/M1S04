package exercicio10;

/*Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora de P.A. e P.G.
Peça para o usuário inserir um “valor inicial”, que deve ser um número inteiro.
Em seguida, peça ao usuário para inserir um valor para a raiz.
Depois, pergunte ao usuário se ele deseja calcular os 10 primeiros valores de uma P.A. ou de uma P.G.
para os números inseridos anteriormente. Então, calcule os 10 primeiros valores de uma P.A. ou P.G.
utilizando os números inseridos pelo usuário, e escreva essa sequência de valores na tela para o usuário visualizar
o resultado. Relembrando: P.A. (Progressão Aritmética) é uma sequência numérica em que cada termo,
a partir do segundo, é igual à soma do termo anterior com a raiz.
Exemplo: Valor inicial = 1; raiz = 3; P.A. = 1, 4, 7, 10, 13, 16, 19, 22, 25, 28.
P.G. (Progressão Geométrica) é como uma P.A., mas em vez de somar, multiplica-se a raiz.
Exemplo: Valor inicial = 1; raiz = 3; P.G. = 1, 3, 9, 27, 81...*/

import java.util.Scanner;

public class CalculaProgressao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n*** Calculadora de P.A. e P.G. ***");

        System.out.print("Informe um número inteiro: ");
        int num = Integer.parseInt(input.nextLine());

        System.out.print("Informe a razão inteira da progressão: ");
        int razao = Integer.parseInt(input.nextLine());

        System.out.print("\nOpções:\n1 - P.A.\n2 - P.G\nDigite a opção desejada: ");
        int op = Integer.parseInt(input.nextLine());
        System.out.println();

        String prog = "";
        if (op ==  1){
            prog = "P.A.";
        } else if (op == 2){
            prog = "P.G.";
        }

        int res = num;

        switch (op){
            case 1 -> {
                System.out.printf("Valor inicial = %d; razão = %d; %s = %d, ", num, razao, prog, res);
                for (int i = num; i < 10; i++){
                    res += razao;
                    if (i<9) {
                        System.out.printf("%d, ", res);
                    } else {
                        System.out.printf("%d.%n%n", res);
                    }
                }
            }
            case 2 -> {
                System.out.printf("Valor inicial = %d; razão = %d; %s = %d, ", num, razao, prog, res);
                for (int i = num; i < 10; i++){
                    res *= razao;
                    if (i<9) {
                        System.out.printf("%d, ", res);
                    } else {
                        System.out.printf("%d.%n%n", res);
                    }
                }
            }
            default ->
                System.out.println("Opção inválida, tente novamente");
        }

    }
}