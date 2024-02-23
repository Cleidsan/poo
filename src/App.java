import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        gameStart();
    }

    public static void gameStart() {
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite aqui um numero de 0 a 10: ");

        int numeroRandom = numeroRandomAleatorio();

        int tentativas = 0;

        for (int t=0; t < 3; t++) {
            int numeroChoice = tec.nextInt();
            tentativas++;

            if (numeroChoice == numeroRandom) {
                System.out.println("Parabéns! você acertou em " + tentativas + " tentativas.");
                break;
            } else if (tentativas == 3) {
                System.out.println("GAME OVER!");
            } else if (numeroChoice > numeroRandom) {
                System.out.println("Escolha um numero menor do que: " + numeroChoice);
            } else {
                System.out.println("Escolha um numero maior do que: " + numeroChoice);
            }
            
        }
    }

    public static int numeroRandomAleatorio() {
        return ThreadLocalRandom.current().nextInt(0,10);
    }
}