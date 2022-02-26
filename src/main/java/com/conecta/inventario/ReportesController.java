package com.conecta.inventario;


import com.conecta.inventario.models.ProductoModel;
import com.conecta.inventario.services.ProductoService;
import com.conecta.inventario.services.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ReportesController {

    @Autowired
    ProductoService productoServicio;

    @Autowired
    VentaService ventaService;
    
    @RequestMapping("/mayorstock")
    public ProductoModel mayorStock( ){
        return productoServicio.mayorStock();
    }
    
    @RequestMapping("/masvendido")
    public ProductoModel masVendido( ){
        return ventaService.masVendido();
    }
    
    // @RequestMapping("/masvendido")
    // public ResponseEntity<?> masVendido( ){

    //     ProductoModel p = productoServicio.crearProducto(producto);

    //     return new ResponseEntity<ProductoModel>(p, HttpStatus.OK);
    // }

}
