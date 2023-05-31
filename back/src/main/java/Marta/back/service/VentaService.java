package Marta.back.service;

import Marta.back.models.Venta;
import Marta.back.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VentaService {
    @Autowired
    VentaRepository ventaRepository;
    // consultas default
    public List<Venta> consultarVentas(){return ventaRepository.findAll();}

    public Venta anadirVenta(Venta venta){return ventaRepository.save(venta);}

    public void eliminarVentas(Venta venta){ventaRepository.delete(venta);}
}
