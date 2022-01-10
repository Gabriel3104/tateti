package org.example;

import org.example.handler.DiagonalvalidatorHandler;
import org.example.handler.Handler;
import org.example.handler.HorizontalValidatorHandler;
import org.example.handler.VerticalValidatorHandler;

public class TableroValidator implements Handler {

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void validar(Tablero tablero){

        DiagonalvalidatorHandler d = new DiagonalvalidatorHandler();
        this.setNext(d);

        HorizontalValidatorHandler h = new HorizontalValidatorHandler();
        d.setNext(h);

        VerticalValidatorHandler v = new VerticalValidatorHandler();
        h.setNext(v);

        this.nextHandler.validar(tablero);
    }
}
