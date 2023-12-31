public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private int transferenciasRealizadas;

    public ContaCorrente(String agencia, String numero, Cliente cliente, double chequeEspecial,
            int transferenciasRealizadas, Notificacao notificacoes) {
        super(agencia, numero, cliente, notificacao);
        this.chequeEspecial = chequeEspecial;
        this.transferenciasRealizadas = 0;
    }

    // faltou sobrescrever o saque para incluir o cheque especial ao saldo

    @Override
    public void transferir(Conta contaDestino, double valor) {
        // faltou incluir o cheque especial ao saldo
        if (transferenciasRealizadas < 2) {
            super.transferir(contaDestino, valor);
            transferenciasRealizadas++;
        } else {
            double taxa = valor * 0.10;
            super.transferir(contaDestino, valor + taxa);
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public int getTransferenciasRealizadas() {
        return transferenciasRealizadas;
    }

    public void setTransferenciasRealizadas(int transferenciasRealizadas) {
        this.transferenciasRealizadas = transferenciasRealizadas;
    }

    public void notificacoes() {

    }
}

