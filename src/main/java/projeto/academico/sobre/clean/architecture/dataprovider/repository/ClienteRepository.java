package projeto.academico.sobre.clean.architecture.dataprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import projeto.academico.sobre.clean.architecture.dataprovider.repository.entities.ClienteEntity;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {
}
