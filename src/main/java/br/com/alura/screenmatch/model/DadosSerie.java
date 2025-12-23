package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonAlias: Define APELIDOS apenas para leitura (Unidirecional).
// O sistema aceita receber "year", "ano_lancamento" ou "data",
// mas quando devolver o JSON, vai sair com o nome original: "ano".

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliacao,
                         // @JsonProperty: Define o nome OFICIAL (Bidirecional).
                         // O sistema espera receber "movie_title" e devolve "movie_title".
                         // O nome "titulo" só existe aqui dentro do Java.
                         @JsonProperty("imdbVotes") String votos)

{
    
}
