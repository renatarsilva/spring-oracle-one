package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import br.com.alura.screenmatch.service.IConverteDados;

import java.util.Scanner;

public class Principal {

    Scanner sc = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();

    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=b6bf7d26";

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = sc.nextLine();

        var json = consumo.obterDados(
        ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

    }
}
