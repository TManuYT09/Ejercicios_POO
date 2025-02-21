package org.example.tema6.excepciones_cajero;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo=saldo;
    }

    public void ingresarSaldo(double ingreso){
        if (ingreso>0){
            if (ingreso>3000){
                throw new DepositoMaximoException();
            }else {
                saldo+=ingreso;
                System.out.println("Dinero ingresado con éxito. Saldo actual: "+getSaldo()+"€");
            }
        }else {
            System.out.println("La cantidad que se quiere ingresar es o es inferior a 0");
        }

    }

    public void retirarSaldo(double retiro){
        if (retiro>0){
            if (retiro>saldo){
                throw new SaldoInsuficienteException();
            } else if (retiro>600) {
                throw new LimiteDiarioException();
            }else {
                saldo-=retiro;
                System.out.println("Dinero retirado con éxito. Saldo actual: "+getSaldo()+"€");
            }
        }else {
            System.out.println("La cantidad que se quiere retirar es o es inferior a 0");
        }
    }

    public void consultaSaldo(){
        System.out.println("Saldo disponible: "+getSaldo()+"€");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
