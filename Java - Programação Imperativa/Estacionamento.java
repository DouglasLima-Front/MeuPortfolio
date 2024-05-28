//Atividades de Programação Imperativa - 2º Período UNICAP.

import java.util.Scanner;

class Carro{
    String marca;
    String placa;
    int ano;
}

class Garagem{
    String id;
    Carro[] carro;
}

public class Estacionamento {

    public static void main(String [] args){
       Scanner s = new Scanner(System.in);
       Garagem garagem = new Garagem();
       garagem.id = "111a";
       garagem.carro = new Carro [2];

       garagem.carro[0] = new Carro();
       garagem.carro[0].ano = 2020;
       garagem.carro[0].marca = "Fiat";
       garagem.carro[0].placa = "111abc";

       garagem.carro[1] = new Carro();
       garagem.carro[1].ano = 2022;
       garagem.carro[1].marca = "Hb20";
       garagem.carro[1].placa = "777666";

       



        
    }
}
