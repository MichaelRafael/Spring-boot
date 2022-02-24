package br.com.teste.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.teste.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	

}
