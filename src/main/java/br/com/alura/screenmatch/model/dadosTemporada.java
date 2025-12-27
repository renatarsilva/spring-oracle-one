package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record dadosTemporada(@JsonAlias("Season") Integer numero,
                             @JsonAlias("Episodes")List<DadosEpisodio> episodios) {
}
