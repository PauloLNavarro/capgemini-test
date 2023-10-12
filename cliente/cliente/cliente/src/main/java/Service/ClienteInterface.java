package Service;

import Entity.Cliente;

import java.util.List;

public interface ClienteInterface {
    List<Cliente> obterTodosClientes();
    Cliente obterClientePorId(Long id);
    Cliente salvarCliente(Cliente cliente);
    void deletarCliente(Long id);
}
