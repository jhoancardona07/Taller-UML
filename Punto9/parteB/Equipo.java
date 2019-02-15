package Punto9.parteB;

import java.util.Collection;

public class Equipo {

    Collection<Jugador> jugadores;
    Jugador capitan;

    public Equipo(Collection<Jugador> jugadores, Jugador capitan) {
        this.jugadores = jugadores;
        this.capitan = capitan;
    }
}