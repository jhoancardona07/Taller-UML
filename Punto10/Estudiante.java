package Punto10;

public class Estudiante extends Persona{

    private String carrera;
    private int legajo;

    public Estudiante() {
        super();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String val) {
        carrera = val;
    }

    public int getlegajo() {
        return legajo;
    }

    public void setlegajo(int val) {
        legajo = val;
    }
}