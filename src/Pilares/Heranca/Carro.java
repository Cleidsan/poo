package Pilares.Heranca;

public class Carro extends Veiculo{
    public void Ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO!");
    }

    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO");
    }
}
