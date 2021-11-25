package exercicio4;

/*Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir um número inteiro.
O programa deve verificar se o número é par ou ímpar, e exibir essa informação de volta ao usuário.*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int number = Integer.parseInt(input.nextLine());

        if ((number % 2) == 0 ){
            System.out.printf("O número %d é PAR.", number);
        }
        else
            System.out.printf("O número %d é ÍMPAR.", number);
    }
}
