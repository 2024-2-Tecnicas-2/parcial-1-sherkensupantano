package com.mycompany.parcial1;

import java.util.ArrayList;

public class Principal {

    static ArrayList<Producto> inventario;

    public static void main(String[] args) {
        inventario = new ArrayList<>();

        // Agregar dispositivos de prueba
        Laptop laptop1 = new Laptop(19, "Intelmamadicimo :v", 005362, "acme XD", "acme plus ultra super wau", 999, 12);
        Telefono smartphone1 = new Telefono(128, 5, 999, "acme2", "acmegalaxi", 888, 4);
        Laptop laptop2 = new Laptop(19, "Intelmamadicimo :v", 005362, "acme XD", "acme plus ultra super wau2", 1999, 12);
        Telefono smartphone2 = new Telefono(128, 5, 999, "acme2", "acmegalaxi2", 1888, 4);
        Audifonos audi = new Audifonos(0001, "pirata", "piratax2", 4, 52);

        inventario.add(laptop1);
        inventario.add(smartphone1);
        inventario.add(laptop2);
        inventario.add(smartphone2);
        inventario.add(audi);

    }



    public Producto buscarProducto(int id) {
        int i = 0;
        Producto xyz = inventario.get(i);
        for (i = 0; i < inventario.size(); i++) {
            if (id == xyz.getId()) {
                return xyz;
            }
        }
        System.out.println("dispositivo no encontrado");
        return null;
    }
}
