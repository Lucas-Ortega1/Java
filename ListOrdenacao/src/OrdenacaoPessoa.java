import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa  {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        
        OrdenacaoPessoa OrdenacaoPessoa = new OrdenacaoPessoa();

        OrdenacaoPessoa.adicionarPessoa("nome 1", 20, 1.56);
        OrdenacaoPessoa.adicionarPessoa("nome 2", 30, 1.80);
        OrdenacaoPessoa.adicionarPessoa("nome 3", 25, 1.70);
        OrdenacaoPessoa.adicionarPessoa("nome 4", 17, 1.56);

        System.out.println(OrdenacaoPessoa.ordenarPorIdade());
        System.out.println(OrdenacaoPessoa.ordenarPorAltura());

    }

    
}


