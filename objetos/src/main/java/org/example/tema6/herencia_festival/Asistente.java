package org.example.tema6.herencia_festival;

//subclase que hereda de Persona
class Asistente extends Persona {
    protected TipoEntrada entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, TipoEntrada entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    public void accederEvento(){
        System.out.println("Accediendo como Asistente: Buscando asiento.");
    }
}