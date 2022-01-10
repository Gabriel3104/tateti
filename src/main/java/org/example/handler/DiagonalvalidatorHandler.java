package org.example.handler;

import org.example.Casilla;
import org.example.Tablero;

import java.util.List;

public class DiagonalvalidatorHandler implements Handler{

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void validar(Tablero tablero) {

        List<Casilla> casillas = tablero.getCasillas();

        Casilla cas1 = casillas.get(0);
        Casilla cas2 = casillas.get(2);
        Casilla cas3 = casillas.get(4);
        Casilla cas4 = casillas.get(6);
        Casilla cas5 = casillas.get(8);

        if (esDiagonal(cas1, cas3, cas5)) {

            imprimirDatosGanador(tablero, cas1.getFicha());

        } else if (esDiagonal(cas2, cas3, cas4)) {

            imprimirDatosGanador(tablero, cas2.getFicha());

        } else if (esDiagonal(cas4, cas3, cas2)) {

            imprimirDatosGanador(tablero, cas4.getFicha());

        } else if (esDiagonal(cas5, cas3, cas1)) {

            imprimirDatosGanador(tablero, cas5.getFicha());
        }

    }

    public boolean esDiagonal(Casilla t, Casilla u, Casilla v){

        return t.isEstaOcupada() && t.getFicha().equals(u.getFicha()) && t.getFicha().equals(v.getFicha());
        
    }

    public void imprimirDatosGanador (Tablero tablero, String campeon){
        tablero.imprimir();
        System.out.println("Gano el jugador " + campeon);
        tablero.setFinDelJuego(true);
    }
}
