package Service;

import Model.Veiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VeiculoServiceTeste {

    @Test
    public void testConstrutorVeiculo() {

        Veiculo veiculo = new Veiculo("Astra", "A3369J8",  true );

       Assertions.assertEquals("Astra", veiculo.getmodelo());
        Assertions.assertEquals("A3369J8", veiculo.getPlaca());
        Assertions.assertEquals( true, veiculo.getStatus());


    }

}

