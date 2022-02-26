package com.conecta.inventario;

import java.util.Optional;

import com.conecta.inventario.models.ProductoModel;
import com.conecta.inventario.models.VentaModel;
import com.conecta.inventario.services.ProductoService;
import com.conecta.inventario.services.VentaService;
import com.conecta.inventario.tools.Error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired 
    VentaService ventaServicio;

    @Autowired
    ProductoService productoServicio;

    @PostMapping
    public ResponseEntity<?> crearVenta(@RequestBody VentaModel venta){

        // Optional<ProductoModel>  p = productoServicio.obtenerProducto(venta.getProducto_id());
        Optional<ProductoModel>  p = productoServicio.findById(venta.getProducto_id());
        ProductoModel m = p.get();



        // if (m.getStock() < venta.getCant()) {
        if (m.getStock() <= 0) {
            Error e = new Error();
            return new ResponseEntity<Error>(e, HttpStatus.BAD_REQUEST);
        }
        
        // Verificación de sytock

        VentaModel v = ventaServicio.crearVenta(venta);
        m.setStock(m.getStock() - v.getCant());
        productoServicio.crearProducto(m);

        return new ResponseEntity<VentaModel>(v, HttpStatus.OK);
    }

    
}