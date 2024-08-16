public class FormatadorCPF {
    public static void main(String[] args) {
        try {
            String cpfFormatado = formatarCPF("09876543219");
            System.out.println(cpfFormatado);
        } catch (CpfInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static String formatarCPF(String cpf) throws CpfInvalidoException {
        if (cpf.length() != 11){
            throw new CpfInvalidoException();
        }


        return "123.456.789.10";
    }
}
