package Pilares.msnmessengernew.apps;

public class Facebook extends Messenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
