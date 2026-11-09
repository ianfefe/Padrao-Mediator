public class PedidoService {

    private static PedidoService instancia = new PedidoService();

    private PedidoService() {}

    public static PedidoService getInstancia() {
        return instancia;
    }

    public String registrar(String item) {
        return "Pedido registrado: " + item;
    }
}
