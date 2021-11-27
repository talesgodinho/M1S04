/*Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário a seguinte frase:
“Adivinhe qual número de 1 a 5 eu estou pensando”. Na sequência, o usuário deve inserir um
número entre 1 e 5, e o seu programa deve gerar aleatoriamente outro número, também de 1 a 5.
Se o número gerado for o mesmo que o usuário inseriu, o programa deve escrever na tela “Você acertou!”,
mas se for diferente, o programa deve escrever “Você errou, o número correto era X”, onde X é o número gerado
aleatoriamente pelo programa.*/

package exercicio5;

import java.util.Scanner;

public class AdivinheNumero {
    public static void main(String[] args) {

        System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");

        int randomNumber = (int) (1 + (Math.random() * 5)); // Gera número aleatório entre 1 e 5.
        Scanner input = new Scanner(System.in);
        int inputNumber = Integer.parseInt(input.nextLine());

        while (inputNumber > 5 || inputNumber < 1) {
            System.out.print("Insira um número entre 1 e 5: ");
            inputNumber = Integer.parseInt(input.nextLine());
        }

        if (inputNumber == randomNumber){
            System.out.println("Você acertou!");
        }
        else {
            System.out.printf("Você errou, o número correto era %d", randomNumber);
        }
    }

}

