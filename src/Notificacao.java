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



