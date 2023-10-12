package Service.impl;

import Entity.Cliente;
import Repository.ClienteRepository;
import Service.ClienteInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class clienteServiceImpl implements ClienteInterface {
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> obterTodosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obterClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

}
