package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista_Compra {
    public static ArrayList<String> listaCompra = new ArrayList<>();

    public static void main(String[] args){
        if (getListaCompra().isEmpty()){
            System.out.println("Esta vacio");
        }else {
            System.out.println("No esta vacio");
        }
        addListaCompra("Tomates");
        if (getListaCompra().isEmpty()){
            System.out.println("Esta vacio");
        }else {
            System.out.println("No esta vacio");
        }

        listaCompra.addAll(Arrays.asList("Leche","Huevos","Lechuga","Nostradamus","Pintenton"));

        System.out.println(getListaCompra().get(3));

        listaCompra.set(2,"Queso");

        if (getListaCompra().contains("Leche")){
            System.out.println("Leche esta en la lista");
        }else {
            System.out.println("Leche no esta en la lista");
        }
    }

    public static void addListaCompra(String producto){
        if (listaCompra.isEmpty()){
            System.out.println("Esta vacio");
        }else {
            listaCompra.add(producto);
        }

    }

    public static ArrayList<String> getListaCompra() {
        return listaCompra;
    }

    public static void setListaCompra(ArrayList<String> listaCompra) {
        if (listaCompra.isEmpty()){
            System.out.println("Esta vacio");
        }else {
            Lista_Compra.listaCompra = listaCompra;
        }
    }
}
