package funcionalidades.multifuncional;

import funcionalidades.aparelhotelefonico.Telefone;
import funcionalidades.navegadorinternet.NavegadorInternet;
import funcionalidades.reprodutormusical.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, Telefone, NavegadorInternet {

    @Override
    public void tocar(){
        System.out.println("Tocando a musica");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(){
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }
    
}
