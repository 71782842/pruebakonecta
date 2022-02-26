package com.conecta.inventario.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class ProductoModel {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String referencia;

    private int precio;

    private int peso;

    private String categoria;

    private int stock;

    private String fecha_creacion;



    public ProductoModel() {
    }
    

    public ProductoModel(Long id, String nombre, String referencia, int precio, int peso, String categoria, int stock, String fecha_creacion) {
        this.id = id;
        this.nombre = nombre;
        this.referencia = referencia;
        this.precio = precio;
        this.peso = peso;
        this.categoria = categoria;
        this.stock = stock;
        this.fecha_creacion = fecha_creacion; 
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFecha_creacion() {
        return this.fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    
}
