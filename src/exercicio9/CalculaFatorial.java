package exercicio9;

/*Crie um programa em Java que, utilizando a classe Scanner, calcule o fatorial de um número inteiro de 0 a 10.
O programa deve pedir para o usuário inserir um número inteiro, mas só deve aceitar valores de 0 a 10,
e então deve calcular o fatorial desse número e escrever o resultado na tela.*/

import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** Calculadora de Fatorial ***");
        int num;
        int res = 1;

        do {
            System.out.print("Informe um número inteiro entre 0 e 10: ");
            num = Integer.parseInt(input.nextLine());
        } while(num < 0 || num > 10);

        for (int i = num; i >= 1; i--){
            res *= i;
        }

        System.out.printf("O fatorial de %d é: %d", num, res);

    }
}
