package exercicio3;

import java.util.Scanner;

/*
Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário que digite sua altura
(2 ou mais casas depois da vírgula), depois peça que o usuário digite seu peso,
e então calcule o IMC e exiba essa informação ao usuário. Fórmula IMC = peso / (altura x altura).
*/

public class CalculaImc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        double altura = Double.parseDouble(input.nextLine());

        System.out.print("Informe o seu peso: ");
        double peso = Double.parseDouble(input.nextLine());

        double imc = peso / (altura*altura);
        System.out.printf("Seu IMC é de %.2f kg/m2", imc);
    }
}
