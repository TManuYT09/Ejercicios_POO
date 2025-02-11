package org.example.herencia_redes_sociales;

public class RedSocial {
    public static void main(String[] args){
        Usuario usu1=new Usuario("Ana",30,"@ana",231);
        Influencer inf1=new Influencer("Luis",25,"@luis_influencer",50000);
        inf1.anyadirColaboracion("MediaMarkt", "Yoigo", "Temu");
        Streamer str1=new Streamer("Carlos",27,"@carlos_stream",2000,5,150);
        Basico bas1=new Basico("Pedro",22,"@pedro123",455);

        System.out.println("Información del Usuario:");
        usu1.mostrarInfo();
        System.out.println();
        System.out.println("Información del Influencer:");
        inf1.mostrarInfo();
        System.out.println();
        System.out.println("Información del Streamer:");
        str1.mostrarInfo();
        System.out.println();
        System.out.println("Información de la Persona Normal:");
        bas1.mostrarInfo();
    }
}
