package com.conecta.inventario.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class VentaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long producto_id;

    private int cant;


    public VentaModel() {
    }


    public VentaModel(Long id, Long producto_id, int cant) {
        this.id = id;
        this.producto_id = producto_id;
        this.cant = cant;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProducto_id() {
        return this.producto_id;
    }

    public void setProducto_id(Long producto_id) {
        this.producto_id = producto_id;
    }

    public int getCant() {
        return this.cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }




}
