package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa jeff = new Pessoa();

        jeff.setEndereco("RUA NIKES");

        System.out.println(jeff.getNome() + "-" + jeff.getCpf());
    }
}
