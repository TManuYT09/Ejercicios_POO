package org.example.tema6.practica1;

import java.util.Scanner;

public class Tienda {
    static Scanner entrada=new Scanner(System.in);

    static void realizarPago(MetodoPago metodo, double importe){
        metodo.procesarPago(importe);
    }

    static void iniciarPago(){
        System.out.println("¿Que metodo de pago va a usar? [Bizum,Paypal,Tarjeta]");
        String metodo=entrada.next();

        switch (metodo){
            case "Tarjeta": pagoTarjeta(); break;
            case "Paypal": pagoPaypal(); break;
            case "Bizum": pagoBizum(); break;
            default: System.out.println("ERROR. Método de pago inexistente"); break;
        }
    }

    public static void pagoTarjeta(){
        boolean val=true;

        System.out.println("Introcude los datos de tu tarjeta:");
        System.out.println("Número (16 dígitos):");
        String nro_tarjeta=entrada.next();
        System.out.println("Tipo (VISA, MASTERCARD O MAESTRO):");
        String tipo= entrada.next();

        TarjetaCredito tar= new TarjetaCredito(nro_tarjeta,tipo);
        System.out.println("Validando tarjeta...");
        val=tar.validarTarjeta();

        if (val){
            System.out.println("Introduce el importe a pagar:");
            double importe=entrada.nextDouble();
            MetodoPago metodoPagoTar=new TarjetaCredito(nro_tarjeta,tipo);
            metodoPagoTar.procesarPago(importe);
        }else {
            System.out.println("Los datos de tu tarjeta no son correctos");
        }
    }

    public static void pagoPaypal(){
        boolean val=true;
        System.out.println("Introduce los datos de tu cuenta de Paypal:");
        System.out.println("Cuenta (xxx@xxx.com)");
        String correo=entrada.next();

        PayPal pay= new PayPal(correo);
        System.out.println("Validando cuenta...");
        val= pay.validarPayPal();

        if (val){
            System.out.println("Introduce el importe a pagar:");
            double importe=entrada.nextDouble();
            MetodoPago metodoPagoPay=new PayPal(correo);
            metodoPagoPay.procesarPago(importe);
        }else {
            System.out.println("Los datos de tu cuenta de Paypal no son correctos");
        }
    }

    public static void pagoBizum(){
        boolean val=true;
        System.out.println("Introduzca los datos de tu cuenta de Bizum");
        System.out.println("Numero de telefono (9 dígitos)");
        String telefono=entrada.next();

        Bizum biz = new Bizum(telefono);
        System.out.println("Validando cuenta...");
        val=biz.validarBizum();

        if(val){
            System.out.println("Introduce el importe a pagar:");
            double importe=entrada.nextDouble();
            MetodoPago metodoPago=new Bizum(telefono);
            metodoPago.procesarPago(importe);
        }else {
            System.out.println("Los datos de tu cuenta de Bizum no son correctos");
        }
    }
}
