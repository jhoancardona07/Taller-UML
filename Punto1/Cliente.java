package Punto1;

public class Cliente {
    
    String nombre;
    private CuentaCorriente cuenta;

    public Cliente() {
        nombre = "";
        cuenta = new CuentaCorriente(this);
    }

}