package org.example;

public class Casilla {

    private boolean estaOcupada;
    private String ficha = "[ ]";

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public void setFicha(String ficha) {
        this.ficha = "[" + ficha + "]";
        this.estaOcupada = true;
    }

    public String getFicha() {
        return ficha;
    }
}
