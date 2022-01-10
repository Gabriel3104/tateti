package org.example;

import java.util.Scanner;

public class Jugador {

    private boolean esTurno;
    private String ficha;
    private Tablero tablero;

    public Jugador(String ficha, boolean esTurno, Tablero tablero){
        this.ficha = ficha;
        this.esTurno = esTurno;
        this.tablero = tablero;
    }

    public boolean isEsTurno() {
        return esTurno;
    }

    public void setEsTurno(boolean esTurno) {
        this.esTurno = esTurno;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public void elegirCasilla() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese la casilla para jugador : " + this.ficha);

        String casilla = myObj.nextLine();

        System.out.println("Casilla selecionada :" + casilla);

        this.tablero.marcarCasilla(this.getFicha(), casilla);
        this.setEsTurno(false);

    }
}
