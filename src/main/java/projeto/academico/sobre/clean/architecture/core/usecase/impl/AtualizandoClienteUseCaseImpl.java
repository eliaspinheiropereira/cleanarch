package projeto.academico.sobre.clean.architecture.core.usecase.impl;

import projeto.academico.sobre.clean.architecture.core.dataprovider.AtualizarCliente;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarEndereco;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.core.usecase.AtualizandoClienteUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarClientePorIdUseCase;

public class AtualizandoClienteUseCaseImpl implements AtualizandoClienteUseCase {

    private final BuscarClientePorIdUseCase buscarClientePorIdUseCase;
    private final BuscarEndereco buscarEndereco;
    private final AtualizarCliente atualizarCliente;

    public AtualizandoClienteUseCaseImpl(BuscarClientePorIdUseCase buscarClientePorIdUseCase, BuscarEndereco buscarEndereco, AtualizarCliente atualizarCliente) {
        this.buscarClientePorIdUseCase = buscarClientePorIdUseCase;
        this.buscarEndereco = buscarEndereco;
        this.atualizarCliente = atualizarCliente;
    }

    @Override
    public void update(Cliente cliente, String cep) {
        this.buscarClientePorIdUseCase.find(cliente.getId());
        var endereco = this.buscarEndereco.buscarEnderecoPorCep(cep);

        cliente.setEndereco(endereco);
        this.atualizarCliente.update(cliente);
    }
}
