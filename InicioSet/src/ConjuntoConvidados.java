import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigo){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigo){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidaddos(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        conjunto.adicionarConvidado("Lucas", 1234);
        conjunto.adicionarConvidado("Maria", 5678);
        conjunto.adicionarConvidado("Pedro", 9101);

        System.out.println("Quantidade de convidados: " + conjunto.contarConvidaddos());

        System.out.println("Convidados:");
        conjunto.exibirConvidados();

        System.out.println("\nRemovendo convidado com código 5678...");
        conjunto.removerConvidadoPorCodigoConvite(5678);

        System.out.println("\nConvidados após remoção:");
        conjunto.exibirConvidados();

        System.out.println("\nQuantidade de convidados: " + conjunto.contarConvidaddos());
    }
}
