package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testes do BeeCrowd 2165 - Ttwitting")
class TtwittingTest {

    private Ttwitting ttwitting;

    @BeforeEach
    void prepararTeste() {
        ttwitting = new Ttwitting();
    }

    @ParameterizedTest
    @CsvSource({
            "0, TWEET",
            "1, TWEET",
            "140, TWEET",
            "141, MUTE",
            "500, MUTE"
    })
    @DisplayName("Deve classificar texto pelo tamanho")
    void deveClassificarTextoPeloTamanho(int tamanho, String esperado) {
        String texto = "a".repeat(tamanho);

        String resultado = ttwitting.classificarMensagem(texto);

        assertEquals(esperado, resultado);
    }

    @Test
    @DisplayName("Deve retornar TWEET para o exemplo do BeeCrowd")
    void deveRetornarTweetParaExemploDoBeeCrowd() {
        String texto = "RT @TheEllenShow: If only Bradley's arm was longer. Best photo ever. #oscars pic.twitter.com/C9U5NOtGap";

        String resultado = ttwitting.classificarMensagem(texto);

        assertEquals("TWEET", resultado);
    }
}