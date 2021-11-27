package exercicio7;

/*
Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir as notas do semestre,
e deve retornar a média final. O programa deve pedir 3 notas, que devem ser números reais,
e retornar um número real com 2 casas depois da vírgula, com o texto “Sua média final é:” seguido do valor.
*/

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double n1 = Double.parseDouble(input.nextLine());

        System.out.print("Informe a segunda nota: ");
        double n2 = Double.parseDouble(input.nextLine());

        System.out.print("Informe a terceira nota: ");
        double n3 = Double.parseDouble(input.nextLine());

        double media = (n1+n2+n3)/3;

        String status = "";

        if (media >= 7){
            status = "Parabéns, você foi aprovado!";
        } else {
            status = "Você reprovou!";
        }

        System.out.printf("%s Sua média final é: %.2f", status, media);

    }
}
