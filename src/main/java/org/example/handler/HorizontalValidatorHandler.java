package org.example.handler;

import org.example.Casilla;
import org.example.Tablero;

import java.util.List;

public class HorizontalValidatorHandler implements Handler{

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void validar(Tablero tablero) {

        List<Casilla> casillas = tablero.getCasillas();

        Casilla uno = casillas.get(0);
        Casilla dos = casillas.get(1);
        Casilla tres = casillas.get(2);

        Casilla cuatro = casillas.get(3);
        Casilla cinco = casillas.get(4);
        Casilla seis = casillas.get(5);

        Casilla siete = casillas.get(6);
        Casilla ocho = casillas.get(7);
        Casilla nueve = casillas.get(8);

        if (esTresEnLinea(uno,dos,tres)){

            imprimirDatosGanador(tablero, uno.getFicha());

        }else if (esTresEnLinea(cuatro,cinco,seis)){

            imprimirDatosGanador(tablero, cuatro.getFicha());

        }else if (esTresEnLinea(siete,ocho,nueve)){

           imprimirDatosGanador(tablero, siete.getFicha());

        }else {
            this.nextHandler.validar(tablero);
        }

    }

    private boolean esTresEnLinea(Casilla a, Casilla b, Casilla c) {
        return a.isEstaOcupada() && a.getFicha().equals(b.getFicha())&& a.getFicha().equals(c.getFicha());
    }

    private void imprimirDatosGanador(Tablero tablero, String ganador){
        tablero.imprimir();
        System.out.println("gano el jugador: " + ganador);
        tablero.setFinDelJuego(true);
    }
}
