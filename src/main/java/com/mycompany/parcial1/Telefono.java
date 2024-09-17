/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Telefono extends Producto {
    private int capacidadAlmacenamiento;
    private int duracionBateria;

    public Telefono(int capacidadAlmacenamiento, int duracionBateria, int id, String marca, String modelo, double precio, int stock) {
        super(id, marca, modelo, precio, stock);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.duracionBateria = duracionBateria;
    }
    



    @Override
    public String toString() {//mostrar detalle
        return super.toString()+"Telefono{" + "capacidadAlmacenamiento=" + capacidadAlmacenamiento + ", duracionBateria=" + duracionBateria + '}';
    }
}
