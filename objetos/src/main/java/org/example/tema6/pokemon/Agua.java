package org.example.tema6.pokemon;

public class Agua extends Pokemon implements AtaquesAgua, CosasAgua{

    public Agua(int nivel, int ps) {
        super(nivel,ps);
    }

    @Override
    public void atacar() {
        System.out.println("PISTOLA AGUAAAAAAAAAA, SQUERO SQUERO");
    }

    @Override
    public void hidroBomba() {
        System.out.println("HIDROBOMBAAAAAAAAA");
    }

    @Override
    public void surf() {
        System.out.println("COJO UNA OLAAAAA");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("FLUSH FLUSHHHH");
    }

    @Override
    public void salpicadura() {
        System.out.println("SALPICADURAAAAAAAA");
    }

    @Override
    public void aquagym() {

    }
}
