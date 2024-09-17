package com.mycompany.parcial1;

public abstract class Producto {
    private int id;
    private String marca;
    private String modelo; 
    private double precio;
    private int stock;

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", stock=" + stock + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto(int id, String marca, String modelo, double precio, int stock) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }


}

