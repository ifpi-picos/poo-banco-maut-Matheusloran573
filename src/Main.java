public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Matheus", "123.456.789-00", "01/01/1990", "Rua A, 123");
        Cliente cliente2 = new Cliente("Henrique", "987.654.321-00", "15/05/1985", "Rua B, 456");

        // não deveria ter objetos direto de new Conta.
        // Todas as contas deveriam serem Poupança ou Corrente
        Conta conta1 = new ContaCorrente(null, null, cliente2, 100, 0, new Notificacao())
        Conta conta2 = new Conta("002", "65432-1", cliente1, null);
        Conta conta3 = new Conta("003", "98765-4", cliente2, null);

        conta1.depositar(1000);
        conta2.depositar(500);
        conta3.depositar(2000);

        conta1.sacar(200);
        conta2.transferir(conta3, 300);

    }
}
