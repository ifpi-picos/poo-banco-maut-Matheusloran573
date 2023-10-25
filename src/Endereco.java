public class Endereco {
    private String estado;
    private String rua;
    private String numero;
    private String cep;

    public Endereco(String estado, String rua, String numero, String cep) {
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
