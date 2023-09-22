package padraoprojeto.gof.service;

import padraoprojeto.gof.model.Cliente;

/**
 * Interface que define o padrão Strategy.
 * 
 * @author renan
 */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);

}
