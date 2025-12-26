package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonAlias Só funciona na entrada (leitura). Aceita apelidos alternativos, mas na hora de gerar o JSON, usa o nome original do Java.
// @JsonIgnoredProperties ignora qualquer coisa que nao seja, Title, totalSeasons, e imdbRating
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliacao)
    // @JsonProperty Muda o nome para sempre (na entrada e na saída). É o novo "nome oficial" do campo no JSON.
{
    
}
