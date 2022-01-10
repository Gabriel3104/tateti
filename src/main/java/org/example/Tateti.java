package org.example;

public class Tateti {

    private Tablero tablero;
    private Jugador jugadorUno;
    private Jugador jugadorDos;

    private TableroValidator tableroValidator;


    public Tateti(){
        this.tableroValidator = new TableroValidator();
        this.tablero = new Tablero();
        this.jugadorUno = new Jugador("X", true, tablero);
        this.jugadorDos = new Jugador("O", false, tablero);
    }

    public void start() {

        System.out.println("El juego comenzo!!!");

        while(!esFinDelJuego()){

            tablero.imprimir();
            if(jugadorUno.isEsTurno()){
                jugadorUno.elegirCasilla();
            }else{
                jugadorDos.elegirCasilla();
                jugadorUno.setEsTurno(true);
            }

            validarTablero();

        }
        System.out.println("Fin del Juego!!!");
    }

    private void validarTablero() {

        this.tableroValidator.validar(this.tablero);
    }

    private boolean esFinDelJuego(){
        return this.tablero.isFinDelJuego();
    }


}
