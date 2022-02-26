package com.conecta.inventario.services;

import com.conecta.inventario.models.ProductoModel;
import com.conecta.inventario.models.VentaModel;
import com.conecta.inventario.repositories.VentaCRUDRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {

    @Autowired
    VentaCRUDRepository ventaRepositorio;

    public VentaModel crearVenta(VentaModel venta){
        return ventaRepositorio.save(venta);
    }
    
    public ProductoModel masVendido(){
        return ventaRepositorio.masVendido();
    }

    
}
