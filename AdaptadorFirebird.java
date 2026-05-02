public class AdaptadorFirebird implements IServicoBancoDeDados {
    private BancoFirebird firebird = new BancoFirebird();

    @Override
    public void iniciarConexao() {
        firebird.conectarMultiplosUsuarios();
    }

    @Override
    public void processarTransacao() {
        firebird.executarTransacaoUnica();
    }
}