public class AdaptadorParadox implements IServicoBancoDeDados {
    private BancoParadox paradox = new BancoParadox();

    @Override
    public void iniciarConexao() {
        paradox.conectarUsuarioUnico();
    }

    @Override
    public void processarTransacao() {
        paradox.executarTransacaoUnica();
    }
}