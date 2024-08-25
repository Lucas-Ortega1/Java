import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<Palavra> conjuntoPalavras = null;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover =null;
        for (Palavra p : conjuntoPalavras) {
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
                break;
            }  
        }
        conjuntoPalavras.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        boolean palavraEncontrada = false;
        for (Palavra p : conjuntoPalavras) {
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                System.out.println("Palavra encontrada: ");
                palavraEncontrada = true;
                break;
            }
        }
        if(palavraEncontrada == false){
            System.out.println("Palavra não encontrada: " + palavra);
        }
    }

    public void exibirPalavrasUnicas(){
        if(!conjuntoPalavras.isEmpty()){
            System.out.println("Palavras únicas: ");
            for (Palavra p : conjuntoPalavras) {
                System.out.println(p.getPalavra());
            }
        } else{
            System.out.println("Conjunto vazio.");
        }
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasSet = new ConjuntoPalavrasUnicas();


        palavrasSet.adicionarPalavra("java");
        palavrasSet.adicionarPalavra("python");
        palavrasSet.adicionarPalavra("C++");
        palavrasSet.adicionarPalavra("ruby");

        palavrasSet.verificarPalavra("java");
        palavrasSet.verificarPalavra("javascript");

        palavrasSet.exibirPalavrasUnicas();

        palavrasSet.removerPalavra("ruby");

        palavrasSet.exibirPalavrasUnicas();
    }
}
