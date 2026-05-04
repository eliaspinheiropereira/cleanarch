package projeto.academico.sobre.clean.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projeto.academico.sobre.clean.architecture.core.dataprovider.AtualizarCliente;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarEndereco;
import projeto.academico.sobre.clean.architecture.core.usecase.AtualizandoClienteUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarClientePorIdUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.impl.AtualizandoClienteUseCaseImpl;

@Configuration
public class UpdateClienteConfig {

    @Bean
    public AtualizandoClienteUseCase atualizandoClienteUseCase(
            BuscarClientePorIdUseCase buscarClientePorIdUseCase,
            BuscarEndereco buscarEndereco,
            AtualizarCliente atualizarCliente
    ){
        return new AtualizandoClienteUseCaseImpl(buscarClientePorIdUseCase, buscarEndereco, atualizarCliente);
    }
}
