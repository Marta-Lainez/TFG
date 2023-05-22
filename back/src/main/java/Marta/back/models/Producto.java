package Marta.back.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre,descripcion,categoria;
    private double precio;
    // relaciones
    @ManyToMany
    private Venta ventas[];
    @ManyToMany
    private Pedido pedidos[];
}
