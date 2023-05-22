package Marta.back.service;

import Marta.back.models.Cliente;
import Marta.back.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    // consultas default
    public List<Cliente> consultarClientes(){return clienteRepository.findAll();}

    public Cliente anadirClientes(Cliente cliente){return clienteRepository.save(cliente);}

    public void eliminarCliente(Cliente cliente){clienteRepository.delete(cliente);}

    // consultas custom
    /*
    public Cliente eliminarClienteId(long id){
        Cliente cliente = clienteRepository.findById(id);
        return clienteRepository.eliminarClienteId(id);
    }*/
    public Cliente consultarClienteId(String id){
        long id_num = Long.parseLong(id);
        return clienteRepository.consultarClienteId(id_num);
    }
}
