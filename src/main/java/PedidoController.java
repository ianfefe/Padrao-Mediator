public class PedidoController {

    private static PedidoController instancia = new PedidoController();

    private PedidoController() {}

    public static PedidoController getInstancia() {
        return instancia;
    }

    public String receberPedido(String item) {
        return PedidoService.getInstancia().registrar(item);
    }
}
