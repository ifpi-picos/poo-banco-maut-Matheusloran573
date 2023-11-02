
// Conta deveria ser abstrata para não permitir criar objetos diretamente dela
public class Conta {
    String numeroAgencia;
    String numeroConta;
    Cliente cliente;
    protected double saldo;
    public static Notificacao notificacao;
    // está falando o histórico de transacṍes para o extrato

    public Conta(String numeroAgencia, String numeroConta, Cliente cliente,
            Notificacao notificacao) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0.0;
        Conta.notificacao = notificacao;
    }

    public Conta(String numero, String string, double saldo2, Cliente cliente2, String senha,
            Endereco endereco) {}

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            notificacao.enviarNotificacao("email",
                    "Depósito de R$" + valor + " na conta " + numeroConta);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            notificacao.enviarNotificacao("sms",
                    "Saque de R$" + valor + " na conta " + numeroConta);
        }
        return false;
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            notificacao.enviarNotificacao("email", "Transferência de R$" + valor + " da conta "
                    + numeroConta + " para a conta " + destino.numeroConta);
        }
    }
}


