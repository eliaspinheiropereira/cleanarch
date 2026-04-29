package projeto.academico.sobre.clean.architecture.entrypoint.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.academico.sobre.clean.architecture.core.domain.PageResult;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarClientePorIdUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.BuscarTodosClientesUseCase;
import projeto.academico.sobre.clean.architecture.core.usecase.InserindoClienteUseCase;
import projeto.academico.sobre.clean.architecture.entrypoint.controller.dto.BuscarClientePorIdDTO;
import projeto.academico.sobre.clean.architecture.entrypoint.controller.dto.BuscarTodosClientesDTO;
import projeto.academico.sobre.clean.architecture.entrypoint.controller.dto.ClienteDTO;
import projeto.academico.sobre.clean.architecture.entrypoint.controller.mapper.ClienteMapper;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private InserindoClienteUseCase inserindoClienteUseCase;

    @Autowired
    private BuscarClientePorIdUseCase buscarClientePorIdUseCase;

    @Autowired
    private BuscarTodosClientesUseCase buscarTodosClientesUseCase;

    @Autowired
    ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<Void> insert(
            @Valid @RequestBody ClienteDTO clienteDTO
    ){
        var cliente = this.clienteMapper.toCliente(clienteDTO);
        this.inserindoClienteUseCase.inserir(cliente, clienteDTO.cep());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BuscarClientePorIdDTO> findById(
            @PathVariable String id
    ){
        var cliente = this.buscarClientePorIdUseCase.find(id);
        var buscarClientePorIdDTO = this.clienteMapper.toBuscarClientePorIdDTO(cliente);
        return new ResponseEntity<>(buscarClientePorIdDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<PageResult<BuscarTodosClientesDTO>> findAll(
            @RequestParam int page,
            @RequestParam int size
    ){
        var result = this.buscarTodosClientesUseCase.findAll(page, size);
        var buscarTodosClientes = result.getContent().stream().map(clienteMapper::toBuscarTodosClientesDTO).toList();
        var buscarTodosClientesDTO = new PageResult<>(
                buscarTodosClientes,
                result.getPage(),
                result.getSize(),
                result.getTotalElements()
        );

        return new ResponseEntity<>(buscarTodosClientesDTO, HttpStatus.OK);
    }
}
