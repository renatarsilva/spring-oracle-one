package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();


    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=b6bf7d26";

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = sc.nextLine();

        var json = consumo.obterDados(
        ENDERECO + nomeSerie.replace("", "+") + API_KEY);
        // "https://www.omdbapi.com/?t=gilmore+girls&apikey=b6bf7d26"

    }
}
