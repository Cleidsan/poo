package Pilares.msnmessengernew;

import java.util.Locale;
import java.util.Scanner;

import Pilares.msnmessengernew.apps.Facebook;
import Pilares.msnmessengernew.apps.Messenger;
import Pilares.msnmessengernew.apps.Msn;
import Pilares.msnmessengernew.apps.Telegram;

public class Computador {
   // New metodo utilizando Polimorfismo

   public static void main(String[] args) {
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        Messenger msi = null;

        System.out.println("Escolha a rede social: [FB] Facebook, [TLG] Telegram, [MSN] Msn");
        String sigla = tec.next().toLowerCase();

        switch (sigla) {
            case "fb":
                msi = new Facebook();
                break;
            case "tlg":
                msi = new Telegram();
                break;
            case "msn":
                msi = new Msn();
                break;
            default:
                break;
        }

        msi.enviarMensagem();
        msi.receberMensagem();
   }
   
    // public static void main(String[] args) {
    //     MSN pc = new MSN();
    //     System.out.println("MSN");
    //     pc.enviarMensagem();
    //     pc.receberMensagem();

    //     Facebook fb = new Facebook();
    //     System.out.println("Facebook");
    //     fb.enviarMensagem();
    //     fb.receberMensagem();

    //     Telegram tg = new Telegram();
    //     System.out.println("Telegram");
    //     tg.enviarMensagem();
    //     tg.receberMensagem();
    // }
}
