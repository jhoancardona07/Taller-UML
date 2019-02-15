package Punto9.parteA;

import java.util.Collection;

public class Persona {
    Collection<Persona> esQueridoPor;
    Collection<Persona> quiereA;

    public Persona(Collection<Persona> esQueridoPor, Collection<Persona> quiereA) {
        this.esQueridoPor = esQueridoPor;
        this.quiereA = quiereA;
    }
}