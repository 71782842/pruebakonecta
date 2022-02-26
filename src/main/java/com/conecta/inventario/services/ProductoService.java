package com.conecta.inventario.services;

import java.util.ArrayList;
import java.util.Optional;

import com.conecta.inventario.models.ProductoModel;
import com.conecta.inventario.repositories.ProductoCRUDRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    @Autowired
    ProductoCRUDRepository productoRepositorio;

    public ProductoModel crearProducto(ProductoModel producto){
        return productoRepositorio.save(producto);
    }
    
    public ArrayList<ProductoModel> listado(){
        return (ArrayList<ProductoModel>) productoRepositorio.findAll();
    }
    
    public ProductoModel mayorStock(){
        return productoRepositorio.findMaxStock();
    }

    public boolean eliminarProducto(Long id){
        try {
            productoRepositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();            
            return false;
        }
    }
    
    public Optional<ProductoModel> findById(Long id){
        return productoRepositorio.findById(id);
    }

}
