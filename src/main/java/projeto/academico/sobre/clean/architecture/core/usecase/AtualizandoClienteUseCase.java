package projeto.academico.sobre.clean.architecture.core.usecase;

import projeto.academico.sobre.clean.architecture.core.domain.Cliente;

public interface AtualizandoClienteUseCase {

    public void update(Cliente cliente, String cep);
}
