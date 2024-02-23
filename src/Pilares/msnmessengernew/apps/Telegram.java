package Pilares.msnmessengernew.apps;

public class Telegram extends Messenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
