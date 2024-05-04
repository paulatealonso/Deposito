package cuentas;

public class CCuenta {

    // Atributos de la clase
    private String titular;
    private double saldo;
    private String cuenta;

    // Constructor
    public CCuenta(String titular, String cuenta, double saldoInicial) {
        this.titular = titular;
        this.cuenta = cuenta;
        this.saldo = saldoInicial;
    }

    // Métodos de la clase
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        this.saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getCuenta() {
        return cuenta;
    }
}

