package org.example.handler;

import org.example.Tablero;

public interface Handler {

    void setNext(Handler handler);
    void validar(Tablero tablero);
}
