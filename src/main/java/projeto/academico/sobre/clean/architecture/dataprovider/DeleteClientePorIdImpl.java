package projeto.academico.sobre.clean.architecture.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projeto.academico.sobre.clean.architecture.core.dataprovider.DeleteClientePorId;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.ClienteRepository;

@Component
public class DeleteClientePorIdImpl implements DeleteClientePorId {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void delete(String id) {
        this.clienteRepository.deleteById(id);
    }
}
