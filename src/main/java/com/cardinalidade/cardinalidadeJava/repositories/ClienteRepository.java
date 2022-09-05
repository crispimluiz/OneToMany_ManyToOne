package com.cardinalidade.cardinalidadeJava.repositories;

import com.cardinalidade.cardinalidadeJava.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
   String consulta = "SELECT c.nomeCliente, e.lagradouro FROM clientes c" +
           "JOIN enderecos e";
   public List<Cliente> getClienteEndereco();
}
