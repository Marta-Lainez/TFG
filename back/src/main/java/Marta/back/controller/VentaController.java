package Marta.back.controller;

import Marta.back.models.Venta;
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
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    Marta.back.service.VentaService VentaService;

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<?> anadirVenta(@RequestBody Venta venta){
        return new ResponseEntity<>(VentaService.anadirVenta(venta), HttpStatus.OK);
    }
}
