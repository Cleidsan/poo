package escola;

import escola.alunos.Aluno;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Luk");
        aluno1.setIdade(18);
        aluno1.setSexo("M");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Niki");
        aluno2.setIdade(20);
        aluno2.setSexo("F");

        System.out.println("O Aluno(a) " + aluno1.getNome() + " Tem " + aluno1.getIdade() + " anos. Sexo: " + aluno1.getSexo());
        System.out.println("O Aluno(a) " + aluno2.getNome() + " Tem " + aluno2.getIdade() + " anos. Sexo: " + aluno2.getSexo());
    }
}
