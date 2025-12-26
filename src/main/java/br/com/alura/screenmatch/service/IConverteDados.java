package br.com.alura.screenmatch.service;

public interface IConverteDados {
    // <T> T é o retorno, obterDados é nome da Interface, String json, Class<T> sao os parametros, fim;
    <T> T obterDados(String json, Class<T> classe);
}
