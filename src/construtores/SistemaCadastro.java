package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa jeff = new Pessoa("Marco");

        jeff.setEndereco("RUA KILLER");

        System.out.println(jeff.getNome() + "-" + jeff.getCpf());
    }
}
