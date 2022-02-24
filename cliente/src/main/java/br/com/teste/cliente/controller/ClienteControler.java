package br.com.teste.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.cliente.model.Cliente;
import br.com.teste.cliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteControler {

	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping
	public List<Cliente> getAllClientes() {
		return clienteService.getAllClientes();
	}
	
	@GetMapping("/{id}") 
	public Cliente getClienteById(@PathVariable Long id) {
		return clienteService.getClienteById(id);
	}
	
	@PostMapping
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		return clienteService.create(cliente);
	}
	
	@PutMapping("/{id}")
	public Cliente upDateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
		return clienteService.upDate(cliente, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		 clienteService.delete(id);
	}
}












