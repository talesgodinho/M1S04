package exercicio1;

/*Crie um programa em Java que, ao executar, verifique o horário atual e escreva para o usuário uma saudação,
contendo o período e o horário. Por exemplo: “Boa tarde, no momento são 15:08.”.*/

import java.time.LocalTime;

public class SaudacaoInicial {
    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();
        String periodo = "";

        String horario = String.format("%02d:%02d", horaAtual.getHour(), horaAtual.getMinute());
  /*   Format  Data   Result
        %02d    1      01
        %02d    11     11*/

        if (horaAtual.isAfter(LocalTime.of(5, 59)) && horaAtual.isBefore(LocalTime.of(12, 0))) {
            periodo = "manhã";
        } else if (horaAtual.isAfter(LocalTime.of(11, 59)) && horaAtual.isBefore(LocalTime.of(18, 0))) {
            periodo = "tarde";
        } else if (horaAtual.isAfter(LocalTime.of(17, 59)) || horaAtual.isBefore(LocalTime.of(6, 0))) {
            periodo = "noite";
        }

        switch (periodo){
            case "manhã" -> System.out.printf("%nBom dia, no momento são %s.%n", horario);
            case "tarde" -> System.out.printf("%nBoa tarde, no momento são %s.%n", horario);
            case "noite" -> System.out.printf("%nBoa noite, no momento são %s.%n", horario);
        }
    }
}
