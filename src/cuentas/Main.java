package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Juan López", "1000-2365-85-123456789", 2500);
        operativa_cuenta(cuenta1, 2300);
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.ingresar(1500);
            cuenta1.retirar(cantidad);
            System.out.println("Fondos tras retirar " + cantidad + ": " + cuenta1.getSaldo());
        } catch (Exception e) {
            System.err.println("Error de operación con la cuenta: " + e.getMessage());
        }
    }
}


