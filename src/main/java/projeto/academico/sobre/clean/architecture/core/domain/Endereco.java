package projeto.academico.sobre.clean.architecture.core.domain;

public class Endereco {

    private String id;
    private String rua;
    private String cidade;
    private String estado;

    public Endereco(){

    }

    public Endereco(String id, String rua, String cidade, String estado) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
