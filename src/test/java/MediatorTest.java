import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediatorTest {

    @Test
    void devePedirItemPeloController() {
        PedidoView view = new PedidoView();

        assertEquals("View: Pedido registrado: Brigadeiro", view.pedir("Brigadeiro"));
    }
}
