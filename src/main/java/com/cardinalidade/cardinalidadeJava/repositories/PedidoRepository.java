package com.cardinalidade.cardinalidadeJava.repositories;

import com.cardinalidade.cardinalidadeJava.model.Cliente;
import com.cardinalidade.cardinalidadeJava.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
