package org.example.tema6.dispositivos_inteligentes;

public class ParlanteInteligente extends Dispositivos{
    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    public void encender() {
        if (getEstado()){
            System.out.println("El parlante ya está encendido.");
        }else {
            System.out.println("Activando parlante con comando de voz...");
            setEstado(true);
        }
    }
}
