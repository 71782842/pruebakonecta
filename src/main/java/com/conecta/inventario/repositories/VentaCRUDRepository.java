package com.conecta.inventario.repositories;

import com.conecta.inventario.models.VentaModel;

import org.springframework.data.repository.CrudRepository;

public interface VentaCRUDRepository extends CrudRepository<VentaModel, Long>{

    // @Query(value = "SELECT * FROM productos JOIN (SELECT producto_id, count(producto_id) as venta FROM ventas ORDER BY venta DESC LIMIT 1) as t ON productos.id = t.producto_id" , nativeQuery = true)
    // ProductoModel masVendido();
    
}
