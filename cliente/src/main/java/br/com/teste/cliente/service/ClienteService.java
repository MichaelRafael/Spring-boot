package br.com.teste.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.cliente.model.Cliente;
import br.com.teste.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente upDate(Cliente cliente, Long id) {
		cliente.setId(id);
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}
	
}
