/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import static com.mycompany.parcial1.Principal.inventario;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private Cliente vinculo;
    private ArrayList<Producto> Lista

    public Cliente getVinculo() {
        return vinculo;
    }

    public void setVinculo(Cliente vinculo) {
        this.vinculo = vinculo;
    }

    public ArrayList<Producto> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Producto> Lista) {
        this.Lista = Lista;
    }

    
        public void agregarDispositivo(Producto pedido) {
        pedido.add(dispositivo);
    }
    
}
