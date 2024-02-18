package Pilares.Abstracao;

public class Autodromo {
    public static void main(String[] args) {
        Carro bmw = new Carro();
        bmw.setChassi("585955");
        //bmw.ligar();
    
        Moto x848 = new Moto();
        x848.setChassi("152456");
        //x848.ligar();

        Veiculo coringa = x848;
        
        coringa.ligar();
    }
    
}
