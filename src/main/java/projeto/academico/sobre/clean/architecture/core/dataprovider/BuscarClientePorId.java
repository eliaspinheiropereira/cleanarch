package projeto.academico.sobre.clean.architecture.core.dataprovider;

import projeto.academico.sobre.clean.architecture.core.domain.Cliente;

import java.util.Optional;

public interface BuscarClientePorId {
    Optional<Cliente> find(String id);
}
