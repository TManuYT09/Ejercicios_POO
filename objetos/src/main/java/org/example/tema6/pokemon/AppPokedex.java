package org.example.tema6.pokemon;

public class AppPokedex {
    public static void main(String[] args) {
        Electrico pikachu = new Electrico(100,100);

        Pokemon pikachu2 = new Electrico(30,21);
        pikachu.atacar();
        pikachu2.atacar();

        Agua squirtle = new Agua(200,100);
        squirtle.atacar();
        squirtle.imprimirDatos();
        squirtle.salpicadura();
        pikachu.atacar();

        pikachu2.atacar();
        Agua squirtle2 = new Agua(200,100);
        squirtle2.atacar();

        Pokemon[] pokemons = {new Electrico(30,21), new Agua(200,100)};

        for (Pokemon pokemon : pokemons){
            pokemon.atacar();
            pokemon.imprimirDatos();

            if (pokemon instanceof Agua){
                ((AtaquesAgua) pokemon).pistolaAgua();
            }
        }

        System.out.println();

        Pokemon jiglipuff = new Pokemon(25,30) {
            @Override
            public void atacar() {
                System.out.println("NADA DE NADA");
            }
        };

        jiglipuff.atacar();
        jiglipuff.imprimirDatos();

        AtaquesAgua ataques=new AtaquesAgua() {
            @Override
            public void hidroBomba() {
                System.out.println("BOOOOOM");
            }

            @Override
            public void surf() {
                System.out.println("COGIENDO OLAS");
            }

            @Override
            public void pistolaAgua() {
                System.out.println("FLUSH FLUSH");
            }

            @Override
            public void salpicadura() {
                System.out.println("SALPICADURAAAAAAAA");
            }
        };

        ataques.hidroBomba();
        ataques.pistolaAgua();

        Electrico pikachu3 = new Electrico(35,12){
            @Override
            public void atacar(){
                System.out.println("RAYOO");
            }
        };

        pikachu3.atacar();
    }
}
