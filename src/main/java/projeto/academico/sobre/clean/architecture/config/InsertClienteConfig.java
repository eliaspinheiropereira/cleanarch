package projeto.academico.sobre.clean.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projeto.academico.sobre.clean.architecture.core.dataprovider.BuscarEndereco;
import projeto.academico.sobre.clean.architecture.core.dataprovider.SalvarCliente;
import projeto.academico.sobre.clean.architecture.core.usecase.InserindoClienteUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.impl.InserindoClienteUseCaseImpl;
import projeto.academico.sobre.clean.architecture.dataprovider.BuscarEnderecoImpl;
import projeto.academico.sobre.clean.architecture.dataprovider.SalvarClienteImpl;

@Configuration
public class InsertClienteConfig {

    @Bean
    public InserindoClienteUseCase inserindoClienteUseCase(
            SalvarCliente salvarCliente,
            BuscarEndereco buscarEndereco
    ){
        return new InserindoClienteUseCaseImpl(salvarCliente, buscarEndereco);
    }

}
