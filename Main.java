import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o perfil do cliente? (Gratuito/Basico/Ultimate): ");
        String perfilCliente = scanner.nextLine().trim();
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
        
        scanner.close();
    }
}