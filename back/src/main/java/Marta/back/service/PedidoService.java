package Marta.back.service;

import Marta.back.models.Pedido;
import Marta.back.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;
    // consultas default
    public List<Pedido> consultarPedidos(){return pedidoRepository.findAll();}

    public Pedido anadirPedidos(Pedido pedido){return pedidoRepository.save(pedido);}

    public void eliminarPedidos(Pedido pedido){pedidoRepository.delete(pedido);}


}
