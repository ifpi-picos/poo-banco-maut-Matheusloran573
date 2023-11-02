
// Notificação deveria ser um interface
public class Notificacao {
    public void enviarNotificacao(String meio, String mensagem) {
        if (meio.equalsIgnoreCase("email")) {
            enviarNotificacaoPorEmail(mensagem);
        } else if (meio.equalsIgnoreCase("sms")) {
            enviarNotificacaoPorSMS(mensagem);
        } else {
            System.out.println("Método de notificação não suportado: " + meio);
        }
    }

    // não é pra haver um método para cada tipo de notificacao, deveria ter uma classe pra cada tipo
    private void enviarNotificacaoPorEmail(String mensagem) {
        System.out.println("Notificação por email enviada: " + mensagem);
    }

    private void enviarNotificacaoPorSMS(String mensagem) {
        System.out.println("Notificação por SMS enviada: " + mensagem);
    }

    public void notificar(String mensagem) {

        System.out.println("Notificação: " + mensagem);
    }
}


