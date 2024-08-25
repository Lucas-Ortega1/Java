import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroLista;

    public CatalogoLivros(){
        this.livroLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro matchFound = null;

        for( Livro l : livroLista){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                matchFound = l;
                break;
            }
        }
        return matchFound;
    }

    public static void main(String[] args) {
        CatalogoLivros lista = new CatalogoLivros();

        lista.adicionarLivro("A Game of Thrones", "George R. R. Martin", 1996);
        lista.adicionarLivro("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        lista.adicionarLivro("1984", "George Orwell", 1949);
        lista.adicionarLivro("As Cronicas de Fogo e Sangue", "George R. R. Martin", 2007);
        lista.adicionarLivro("A revolucao dos bichos", "George Orwell", 1975);
        System.out.println("Livros do Autor: George R. R. Martin");
        for (Livro l : lista.pesquisarPorAutor("George R. R. Martin")) {
            System.out.println(l.getTitulo());
        }
        System.out.println("\nLivros Publicados entre 1950 e 2000");
        for (Livro l : lista.pesquisarPorAno(1950, 2000)) {
            System.out.println(l.getTitulo());
        }
        System.out.println("\nLivro 'A Game of Thrones'");
        Livro match = lista.pesquisarPorTitulo("A Game of Thrones");
        if(match != null) {
            System.out.println(match.getTitulo() + " - " + match.getAutor());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
