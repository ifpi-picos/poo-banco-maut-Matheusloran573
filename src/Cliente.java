public class Cliente {
    private final String nome;
    private final String cpf;
    String dataNascimento;
    String endereco;

    public Cliente(String nome, String cpf, String dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
     public String getdataNascimento() {
        return dataNascimento;
        
    }
     public String getendereco() {
        return endereco ;
    }
}
