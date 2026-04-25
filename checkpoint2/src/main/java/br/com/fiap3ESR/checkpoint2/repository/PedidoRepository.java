package br.com.fiap3ESR.checkpoint2.repository;

import br.com.fiap3ESR.checkpoint2.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}