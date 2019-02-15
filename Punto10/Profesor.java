package Punto10;

public class Profesor extends Persona{

    private String materia;
    private String cargo;

    public Profesor() {
        super();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String val) {
        materia = val;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String val) {
        cargo = val;
    }
}