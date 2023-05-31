package Marta.back.controller;

import Marta.back.models.Pedido;
import Marta.back.service.PedidoService;
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
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    PedidoService PedidoService;

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<?> anadirPedido(@RequestBody Pedido pedido){
        return new ResponseEntity<>(PedidoService.anadirPedidos(pedido), HttpStatus.OK);
    }
}
