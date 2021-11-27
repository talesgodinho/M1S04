package exercicio8;

/*Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora. O programa deve pedir um número,
depois outro, e por último uma operação. O sistema deve aceitar como operação qualquer uma dessas 4 opções:
“somar”, “subtrair”, “multiplicar” ou "dividir", e realizar a operação correspondente entre os 2 números inseridos,
para então escrever na tela do usuário o resultado.*/

import java.util.Scanner;

public class CriaCalculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String op;
        double res;

        System.out.print("Informe o primeiro número: ");
        double n1 = Double.parseDouble(input.nextLine());

        System.out.print("Informe o segundo número: ");
        double n2 = Double.parseDouble(input.nextLine());

        System.out.print("Qual operação deseja realizar? Escreva a opção: (somar/subtrair/multiplicar/dividir): ");
        op = input.next();

        switch (op) {
            case "somar" -> {
                res = n1 + n2;
                System.out.printf("O resultado de %.2f+%.2f é: %.2f", n1, n2, res);
            }
            case "subtrair" -> {
                res = n1 - n2;
                System.out.printf("O resultado de %.2f-%.2f é: %.2f", n1, n2, res);
            }
            case "multiplicar" -> {
                res = n1 * n2;
                System.out.printf("O resultado de %.2f*%.2f é: %.2f", n1, n2, res);
            }
            case "dividir" -> {
                res = n1 / n2;
                System.out.printf("O resultado de %.2f/%.2f é: %.2f", n1, n2, res);
            }
            default -> System.out.print("Sua opção é inválida! Tente novamente.\n");
        }
    }
}