package usuario;

import funcionalidades.aparelhotelefonico.Telefone;
import funcionalidades.multifuncional.IPhone;
import funcionalidades.navegadorinternet.NavegadorInternet;
import funcionalidades.reprodutormusical.ReprodutorMusical;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        IPhone aparelho = new IPhone();

        Telefone telefone = aparelho;
        NavegadorInternet navegador = aparelho;
        ReprodutorMusical reproduzirMusica = aparelho;

        telefone.ligar();
        telefone.iniciarCorreioVoz();
        telefone.ligar();
        telefone.atender();
        
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        reproduzirMusica.selecionarMusica("Super shy");
        reproduzirMusica.tocar();
        reproduzirMusica.pausar();
        
    }
}
