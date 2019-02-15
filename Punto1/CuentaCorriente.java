package Punto1;

public class CuentaCorriente{

    private double saldo;
    private Cliente dueno;

    public CuentaCorriente(Cliente dueno) {
        saldo = 0;
        this.dueno = dueno;
    }
}