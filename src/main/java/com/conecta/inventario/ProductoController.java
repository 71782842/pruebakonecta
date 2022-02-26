package com.conecta.inventario;

import java.util.ArrayList;

import com.conecta.inventario.models.ProductoModel;
import com.conecta.inventario.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    ProductoService productoServicio;

    @GetMapping
    public ArrayList<ProductoModel> listado(){
        return productoServicio.listado();
    }

    @PostMapping
    public ResponseEntity<?> crearProducto( @RequestBody ProductoModel producto ){

        ProductoModel p = productoServicio.crearProducto(producto);

        return new ResponseEntity<ProductoModel>(p, HttpStatus.OK);
    }

    @DeleteMapping(path="{id}")
    public String eliminarProducto(@PathVariable("id") Long id){
        boolean eliminado = productoServicio.eliminarProducto(id);
        if (eliminado) return "Producto Eliimnado";
        else return "Error al eliminar el producto";
    }

    

}
