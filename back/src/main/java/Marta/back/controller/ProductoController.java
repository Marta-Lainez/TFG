package Marta.back.controller;

import Marta.back.models.Producto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
@CrossOrigin(origins = "*")
@Slf4j
@RequestMapping("/productos")
public class ProductoController {@Autowired
Marta.back.service.ProductoService ProductoService;

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<?> anadirProducto(@RequestBody Producto producto){
        return new ResponseEntity<>(ProductoService.anadirProducto(producto), HttpStatus.OK);
    }

}
