package projeto.academico.sobre.clean.architecture.core.usecase.impl;

import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarEndereco;
import projeto.academico.sobre.clean.architecture.core.dataprovider.SalvarCliente;
import projeto.academico.sobre.clean.architecture.core.domain.Cliente;
import projeto.academico.sobre.clean.architecture.core.usecase.InserindoClienteUseCase;


public class InserindoClienteUseCaseImpl implements InserindoClienteUseCase {

    private final SalvarCliente salvarCliente;
    private BuscarEndereco buscarEndereco;

    public InserindoClienteUseCaseImpl(SalvarCliente salvarCliente, BuscarEndereco buscarEndereco) {
        this.salvarCliente = salvarCliente;
        this.buscarEndereco = buscarEndereco;
    }

    @Override
    public void inserir(Cliente cliente, String cep) {
        var endereco = this.buscarEndereco.buscarEnderecoPorCep(cep);
        cliente.setEndereco(endereco);
        this.salvarCliente.salvar(cliente);
    }
}
