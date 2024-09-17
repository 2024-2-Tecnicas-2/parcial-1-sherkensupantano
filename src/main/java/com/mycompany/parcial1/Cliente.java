/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private String nombre;
    private String direccion;
 
    
    public Cliente(String nombre, String direccion, ArrayList<Producto> Lista) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Lista = Lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    @Override
    public String toString() {
        return "Cliente{" + "Lista=" + Lista + '}';
    }
    
    public void Comprar(Producto producto){
        int wow = producto.getStock();
         wow = wow - 1;
         this.Lista.add(producto);
    }
    
}
