package interfacess.multifuncional;

import interfacess.copiadora.Copiadora;
import interfacess.digitalizadora.Digitalizadora;
import interfacess.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
    }
    
}
