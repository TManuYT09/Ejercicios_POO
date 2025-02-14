package org.example.tema6.practica1;

public class PayPal extends MetodoPago{
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-].com$";

    private String cuenta;
    private double saldo;

    public PayPal(String cuenta){
        this.cuenta=cuenta;
        saldo=23;
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+" con PayPal");
        if (importe<=saldo){
            System.out.println("Pago aceptado. Muchas gracias.");
        }else {
            System.out.println("El pago no se a podido realizar debido a que posee poco saldo en la cuenta");
        }
    }

    public boolean validarPayPal(){
        if (!cuenta.matches(FORMATO_CORREO)){
            System.out.println("El formato del correo es erroneo.");
            return false;
        }
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
