package Pilares.msnmessengernew.apps;

public class Msn extends Messenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }

}
