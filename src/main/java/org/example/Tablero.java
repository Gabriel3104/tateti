package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private List<Casilla> casillas;

    private boolean finDelJuego;


    public Tablero(){
        this.casillas = new ArrayList<>();
        for (int i = 0; i < 9; i++) {

            this.casillas.add(new Casilla());
        }
    }

    public void imprimir() {

        System.out.print(this.casillas.get(0).getFicha());
        System.out.print(this.casillas.get(1).getFicha());
        System.out.println(this.casillas.get(2).getFicha());

        System.out.print(this.casillas.get(3).getFicha());
        System.out.print(this.casillas.get(4).getFicha());
        System.out.println(this.casillas.get(5).getFicha());

        System.out.print(this.casillas.get(6).getFicha());
        System.out.print(this.casillas.get(7).getFicha());
        System.out.println(this.casillas.get(8).getFicha());

    }

    public void marcarCasilla(String ficha, String casilla) {
        Casilla casillaSeleccionada = this.casillas.get(Integer.parseInt(casilla));

        if(!casillaSeleccionada.isEstaOcupada()){
            casillaSeleccionada.setFicha(ficha);
        }else{
            System.out.println("La casilla " + casilla + " esta ocupada");
        }

    }

    public List<Casilla> getCasillas() {
        return this.casillas;
    }

    public boolean isFinDelJuego() {
        return finDelJuego;
    }

    public void setFinDelJuego(boolean finDelJuego) {
        this.finDelJuego = finDelJuego;
    }
}
