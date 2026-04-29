package projeto.academico.sobre.clean.architecture.core.domain;

public class Cliente {
    private String id;
    private String nome;
    private String cpf;
    private Boolean isValidCpf;
    private Endereco endereco;

    public Cliente(){
        this.isValidCpf = false;
    }

    public Cliente(String id, String nome, String cpf, Boolean isValidCpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
