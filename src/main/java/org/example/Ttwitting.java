package org.example;

public class Ttwitting {
    public String classificarMensagem(String texto) {
        if (texto.length() <= 140) {
            return "TWEET";
        }

        return "MUTE";
    }
}
