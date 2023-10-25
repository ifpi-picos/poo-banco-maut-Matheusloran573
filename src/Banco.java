import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final String cpf;
    private List<String> contas;
    private List<String> transacoes;

    public Banco(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
        this.transacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<String> getContas() {
        return contas;
    }

    public void adicionarConta(String conta) {
        contas.add(conta);
    }

    public void adicionarTransacao(String transacao) {
        transacoes.add(transacao);
    }

    public List<String> getTransacoes() {
        return transacoes;
    }

    public static void main(String[] args) {
        Banco cliente1 = new Banco("NomeCliente1", "CPF1");
        cliente1.adicionarConta("Conta1");
        cliente1.adicionarConta("Conta2");

        cliente1.adicionarTransacao("Transacao1");
        cliente1.adicionarTransacao("Transacao2");

        System.out.println("Cliente 1:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Contas: " + cliente1.getContas());
        System.out.println("Transações: " + cliente1.getTransacoes());
    }
}
