import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private List<String> transacoes;

    public Transacao() {
        this.transacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        String transacao = "Depósito de R$" + valor;
        transacoes.add(transacao);
    }

    public void sacar(double valor) {
        String transacao = "Saque de R$" + valor;
        transacoes.add(transacao);
    }

    public void transferir(double valor, String contaDestino) {
        String transacao = "Transferência de R$" + valor + " para a conta " + contaDestino;
        transacoes.add(transacao);
    }

    public List<String> verExtrato() {
        return transacoes;
    }
}
