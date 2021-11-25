package exercicio2;

/*
Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome,
e então escreva na tela, em uma única “string”, o nome completo do usuário.
Informe também ao usuário quantas letras tem no nome dele.
*/

import java.util.Scanner;

public class NomeUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();

        String nomeCompleto = nome + " " + sobrenome;
        System.out.printf("\n%s", nomeCompleto);

        System.out.printf("\nSeu nome possui %d letras!", nome.length());
    }
}

