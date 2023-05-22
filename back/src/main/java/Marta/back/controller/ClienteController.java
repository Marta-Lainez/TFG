package Marta.back.controller;

import Marta.back.models.Cliente;
import Marta.back.service.ClienteService;
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
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("/all")// esto sera la direccion localhost:8081/usuarios/all
    public ResponseEntity consultarClientes(){
        return new ResponseEntity<>(clienteService.consultarClientes(), HttpStatus.OK);
    }
    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<?> anadirCliente(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.anadirClientes(cliente),HttpStatus.OK);
    }
    @PostMapping(value = "/delete", consumes = "application/json")
    public ResponseEntity<?> eliminarCliente(@RequestBody Cliente cliente){
        clienteService.eliminarCliente(cliente);
        return new ResponseEntity<>("",HttpStatus.OK);
    }
    @GetMapping("/getOne")// esto sera la direccion localhost:8081/usuarios/getOne
    public ResponseEntity consultarClienteId(@RequestBody String id){
        return new ResponseEntity<>(clienteService.consultarClienteId(id), HttpStatus.OK);
    }
    /*
    @GetMapping("/dropOne")// esto sera la direccion localhost:8081/usuarios/dropOne
    public ResponseEntity eliminarClienteId(@RequestBody String id){
        return new ResponseEntity<>(clienteService.eliminarClienteId(id), HttpStatus.OK);
    }
    */

}
