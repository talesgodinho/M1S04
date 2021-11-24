package aula2;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {

        long numeroBastanteLongo = 2147484648L;

        /*float numeroDecimal = 3.8f;         Exemplo com f ao final*/
        float numeroDecimal = (float) 3.8;  //Exemplo com typecast
        System.out.println(numeroBastanteLongo);
        System.out.println(numeroDecimal);

        double idade = 22;
        System.out.println("Idade double: " + idade);
        int idadeInteger = (int) idade;     //typecast de double para inteiro
        System.out.println("Idade inteiro: " + idadeInteger);

        char primeiraLetraDoNome = 'T';
        String nome = "Tales";
        String sobrenome = "Godinho";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("A letra inicial do nome " + nome + " é: " + primeiraLetraDoNome);

        double altura = 1.78;
        System.out.println("Minha altura é: " + altura + "m");
        System.out.printf("A altura de %s formatada é: %.2fm %n", nomeCompleto, altura); //formata com o padrão do sistema que está executando.
        /* System.out.format();  = printf
        * \n e %n = quebra de linha */

        System.out.print("\nInforme sua cidade: ");
        Scanner entrada = new Scanner(System.in);
        String cidade = entrada.nextLine();

        System.out.print("Informe seu peso: ");/*
        double peso = entrada.nextDouble(); Pode gerar erro conforme sistema do usuário, informando com "." ou ",". Poderia receber como string e depois converter..
*/      double peso = Double.parseDouble(entrada.nextLine());

        System.out.print("Informe seu ano de nascimento: ");
        int anoDeNascimento = Integer.parseInt(entrada.nextLine());

        System.out.println("\nCidade: " + cidade);
        System.out.printf("Peso: %.3f", peso);
        System.out.printf("\nAno de nascimento: %d", anoDeNascimento);

        //String = idadeInteger;  = String não recebe tipo primitivo

        String idadeStr = String.valueOf(idadeInteger);
        String idadeStr2 = Integer.toString(idadeInteger);

        System.out.println("\n\nIdade str: " + idadeStr);
        System.out.println("Idade str 2: " + idadeStr2);

        double valor = Double.parseDouble("50");
        System.out.println("Valor: " + valor);

        System.out.println("Cinco".length());
        System.out.println("maiusculo".toUpperCase());
        System.out.println("MInUscuLo".toLowerCase());
        System.out.println("    Espaços    mais  Espaços     ".trim()); //Remove espaços do início e fim

        boolean ehIgual = nome.equals("tales");
        System.out.println(ehIgual);

        boolean ehIgual2 = nome.equalsIgnoreCase("tales");
        System.out.println(ehIgual2);

        System.out.println(nome.charAt(0));             //devolve o caracter da posição 0 da string
        System.out.println(nome.lastIndexOf('e'));  //devolve a posição na string do último caracter igual ao informado
        System.out.println(nome.replace('e', 'i'));
        System.out.println(nome.substring(1,3));

        System.out.println("".isBlank());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());

    }
}
