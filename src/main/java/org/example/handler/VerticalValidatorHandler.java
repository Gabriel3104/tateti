package org.example.handler;

import org.example.Casilla;
import org.example.Tablero;

import java.util.List;

public class VerticalValidatorHandler implements Handler{

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void validar(Tablero tablero) {

        List<Casilla> casillas = tablero.getCasillas();

        Casilla A = casillas.get(0);
        Casilla B = casillas.get(3);
        Casilla C = casillas.get(6);

        Casilla D = casillas.get(1);
        Casilla E = casillas.get(4);
        Casilla F = casillas.get(7);

        Casilla G = casillas.get(2);
        Casilla H = casillas.get(5);
        Casilla I = casillas.get(8);


        if (esLineaVertical(A, B, C)){

            imprimirDatosGanador(tablero, A.getFicha());

        }else if (esLineaVertical(D, E, F)){

            imprimirDatosGanador(tablero,D.getFicha());

        }else if (esLineaVertical(G, H, I)){

            imprimirDatosGanador(tablero, G.getFicha());

        }

    }

    private boolean esLineaVertical(Casilla x, Casilla y, Casilla z){
        return x.isEstaOcupada() && x.getFicha().equals(y.getFicha()) && x.getFicha().equals(z.getFicha());
    }

    private void imprimirDatosGanador(Tablero tablero, String victorioso) {
        tablero.imprimir();
        System.out.println("gano el jugador: " + victorioso);
        tablero.setFinDelJuego(true);
    }
}
