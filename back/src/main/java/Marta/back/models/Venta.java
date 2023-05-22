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
@Table(name="venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fecha;
    // relaciones
    @OneToMany
    @JoinColumn(name="id_cliente")
    private Cliente[] clientes;
}
