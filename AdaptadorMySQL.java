public class AdaptadorMySQL implements IServicoBancoDeDados {
    private BancoMySQL mysql = new BancoMySQL();

    @Override
    public void iniciarConexao() {
        mysql.conectarMultiplosUsuarios();
    }

    @Override
    public void processarTransacao() {
        mysql.executarMultiplasTransacoes();
    }
}