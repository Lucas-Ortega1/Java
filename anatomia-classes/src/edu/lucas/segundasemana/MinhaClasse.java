package edu.lucas.segundasemana;

public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Lucas";
        String segundoNome = "Ortega";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Nome completo: " + nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
