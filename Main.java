public class Main {
    public static void main(String[] args) {
        // String perfilCliente = "Basico"; 
        // String perfilCliente = "Gratuito"; 
        String perfilCliente = "Ultimate";
         
        IServicoBancoDeDados bancoSelecionado = null;

        switch (perfilCliente) {
            case "Gratuito":
                bancoSelecionado = new AdaptadorParadox();
                break;
            case "Basico":
                bancoSelecionado = new AdaptadorFirebird();
                break;
            case "Ultimate":
                bancoSelecionado = new AdaptadorMySQL();
                break;
            default:
                System.out.println("Perfil inválido.");
                return;
        }

        System.out.println("--- Perfil: " + perfilCliente + " ---");
        bancoSelecionado.iniciarConexao();
        bancoSelecionado.processarTransacao();
    }
}