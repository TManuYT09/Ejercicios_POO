package org.example;

public class Televisor {
    private int canal=1;
    private int volumen=5;

    public Televisor(){

    }

    public Televisor(int valorCanal, int valorVolumen){
        this.canal=valorCanal;
        this.volumen=valorVolumen;
    }

    public void subirCanal(){
        if(this.canal==99){
            this.canal=1;
        }else {
            this.canal++;
        }
    }

    public void bajarCanal(){
        if(this.canal==1){
            this.canal=99;
        }else {
            this.canal--;
        }
    }

    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setCanal(int valorCanal) {
        if (valorCanal>=1 && valorCanal<=99){
            this.canal = valorCanal;
        }
        System.out.println("Canal: "+this.canal);
    }

    public void setVolumen(int valorVolumen) {
        if (valorVolumen>=0 && valorVolumen<=100){
            this.volumen = valorVolumen;
        }
        System.out.println("Volumen: "+this.volumen);
    }

    @Override
    public String toString(){
        return "Canal: "+this.canal+" con el volumen "+this.volumen;
    }
}
