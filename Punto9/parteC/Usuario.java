package Punto9.parteC;

public class Usuario {

    String nombre;
    Clave clave;

    public Usuario(String nombre) {
        this.nombre = nombre;
        clave = new Clave();
    }

}