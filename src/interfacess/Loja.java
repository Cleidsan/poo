package interfacess;

import interfacess.copiadora.Copiadora;
import interfacess.copiadora.Xerox;
import interfacess.digitalizadora.Digitalizadora;
import interfacess.digitalizadora.Scanner;
import interfacess.impressora.Deskjet;
import interfacess.impressora.Impressora;
import interfacess.impressora.Lestjek;
import interfacess.multifuncional.Multifuncional;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        scanner.digitalizar();

        Impressora impressora = new Deskjet();
        impressora.imprimir();

        Impressora impres = new Lestjek();
        impres.imprimir();

        Copiadora copiar = new Xerox();
        copiar.copiar();

        Digitalizadora digitaliza = new Scanner();
        digitaliza.digitalizar();
        
        Multifuncional em = new Multifuncional();

        Copiadora copiadora = em;
        Digitalizadora digitalizar = em;
        Impressora imprimir = em;

        copiadora.copiar();
        digitalizar.digitalizar();
        imprimir.imprimir();
    }
}
