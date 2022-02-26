package com.conecta.inventario.repositories;

import com.conecta.inventario.models.ProductoModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductoCRUDRepository extends CrudRepository<ProductoModel, Long> {

        @Query(value = "SELECT * FROM productos ORDER BY stock DESC LIMIT 1", nativeQuery = true)
        ProductoModel findMaxStock();
        
        
        


        
        // @Query(value = "SELECT * FROM productos WHERE id = ?", nativeQuery = true)
        // ProductoModel buscarId(Long id);
        
        // @Query(value = "SELECT productos.* FROM productos JOIN ventas ON ventas.producto_id = productos.id WHERE ", nativeQuery = true)
        // ProductoModel findMasVendido();

}
