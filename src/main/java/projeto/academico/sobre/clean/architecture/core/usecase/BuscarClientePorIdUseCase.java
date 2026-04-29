package projeto.academico.sobre.clean.architecture.core.usecase;

import projeto.academico.sobre.clean.architecture.core.domain.Cliente;

public interface BuscarClientePorIdUseCase {
    Cliente find(String id);
}
