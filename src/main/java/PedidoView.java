public class PedidoView {

    public String pedir(String item) {
        return exibir(PedidoController.getInstancia().receberPedido(item));
    }

    public String exibir(String mensagem) {
        return "View: " + mensagem;
    }
}
