package Marta.back.repository;

import Marta.back.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    /*
    @Query(value = "DELETE FROM Cliente c WHERE c.id = ?1")
    Cliente eliminarClienteId(long id);*/

    @Query(value = "SELECT c FROM Cliente c WHERE c.id = ?1")
    Cliente consultarClienteId(long id);

}
