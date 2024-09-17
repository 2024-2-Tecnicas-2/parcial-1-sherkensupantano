/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Laptop extends Producto{
    private double tamañoPantalla;
    private String tipoProcesador;

    public Laptop(double tamañoPantalla, String tipoProcesador, int id, String marca, String modelo, double precio, int stock) {
        super(id, marca, modelo, precio, stock);
        this.tamañoPantalla = tamañoPantalla;
        this.tipoProcesador = tipoProcesador;
    }


  

    @Override
    public String toString() {
        return super.toString()+"Laptop{" + "tama\u00f1oPantalla=" + tamañoPantalla + ", tipoProcesador=" + tipoProcesador + '}';
    }
    

    

}
