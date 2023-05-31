package Marta.back.service;

import Marta.back.models.Producto;
import Marta.back.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    // consultas default
    public List<Producto> consultarProductos(){return productoRepository.findAll();}

    public Producto anadirProducto(Producto producto){return productoRepository.save(producto);}

    public void eliminarProducto(Producto producto){productoRepository.delete(producto);}
}
