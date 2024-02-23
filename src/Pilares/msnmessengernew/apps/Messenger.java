package Pilares.msnmessengernew.apps;

public abstract class Messenger {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado");
    }
}
