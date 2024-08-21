public class ComputadorUsuario {
    public static void main(String[] args) throws Exception {
        
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "Facebook";

        if (appEscolhido.equals("Facebook")){
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("Telegram")){
            smi = new Telegram();
        } else {
            System.out.println("Opcao desconhecida"); 
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
