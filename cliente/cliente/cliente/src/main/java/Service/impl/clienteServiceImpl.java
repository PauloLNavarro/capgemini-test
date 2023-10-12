package Service.impl;

import Entity.Cliente;
import Repository.ClienteRepository;
import Service.ClienteInterface;
import org.springframework.beans.factory.annotation.Autowired;


public class clienteServiceImpl implements ClienteInterface {
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public void save(Cliente cliente) {
        if (!cliente.getName().isEmpty()){
            clienteRepository.save(cliente);
        }
    }

    @Override
    public void delete(Cliente cliente) {
        if(!cliente.getId().describeConstable().isEmpty()){
            clienteRepository.delete(cliente);
        }
    }

}
