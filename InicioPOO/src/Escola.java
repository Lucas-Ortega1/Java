public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno() ;

        aluno1.setNome("Lucas");
        aluno1.setIdade(22);

        System.out.println("O nome do aluno e: " + aluno1.getNome());
        System.out.println("A idade e: " + aluno1.getIdade());

    }
}
