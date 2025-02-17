package org.example.tema6.practica1;

public class TarjetaCredito extends MetodoPago{
    private static final String[] tiposTarjeta={"VISA","MASTERCARD","MAESTRO"};

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito (String nro_tarjeta, String tipo){
        this.nro_tarjeta=nro_tarjeta;
        this.tipo=tipo;
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con tarjeta de "+tipo);
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    public boolean validarTarjeta(){
        if (nro_tarjeta.length()!=16){
            return false;
        }

        for (int i = 0; i < tiposTarjeta.length; i++) {
            if (tiposTarjeta[i].equals(tipo)){
                return true;
            }
        }
        return false;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
