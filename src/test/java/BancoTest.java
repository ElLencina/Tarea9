
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BancoTest {
    private final Banco banco = new Banco();


    @Test
    public void transaccionRetiroVerdaderoTest(){
        boolean exito = banco.Transaccion(1, 10000);
        assertTrue(exito);
    }

    @Test
    public void transaccionRetiroFalsoTest(){
        boolean exito = banco.Transaccion(1,10005);
        assertFalse(exito);
    }

    @Test
    public void transaccionDepositoTest(){
        boolean exito = banco.Transaccion(2,1000);
        assertTrue(exito);
    }

    @Test
    public void transaccionConsultarSaldoTest(){
        boolean exito = banco.Transaccion(3,1000);
        assertTrue(exito);
    }
}
