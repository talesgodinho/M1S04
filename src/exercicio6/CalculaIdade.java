package exercicio6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário sua data de nascimento e
calcule a sua idade. Se o usuário tiver 18 anos ou mais, escreva na tela “você é maior de idade”,
mas caso tenha menos de 18 anos, escreva “você é menor de idade”.
*/

public class CalculaIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento no padrão -> 'dd/MM/yyyy': ");
        String nasc = input.nextLine();

        LocalDate dayNow = LocalDate.now();
        LocalDate nascFormat = LocalDate.parse(nasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        int idade = Period.between(nascFormat, dayNow).getYears();

        if (idade >= 18) {
            System.out.printf("Você é maior de idade, pois possui %d anos.", idade);
        } else {
            System.out.printf("Você é menor de idade, pois possui %d anos.", idade);
        }
    }
}
