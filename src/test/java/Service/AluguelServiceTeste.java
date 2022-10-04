package Service;

import Model.Aluguel;
import Model.Veiculo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static Service.VeiculoService.*;

public class AluguelServiceTeste {

    @Test
    public void testCadastrarAluguel() {

        Object veiculoService;
        Mockito.when(buscaveiculo("A3369J8"))
                .thenReturn(new Veiculo ("Astra", "A3369J8", true ));
        Mockito.when(buscarveiculo("A3369J8"))
                .thenReturn(new Veiculo("Astra", "A3369J8", true));

        Aluguel aluguel
                = aluguelService.cadastrarAluguel ();

        Assertions.assertEquals("Astra", aluguel.getVeiculoAlugado().getmodelo());
        Assertions.assertEquals(LocalDate.now(), aluguel.getDataEmprestimo());
        Assertions.assertEquals(LocalDate.now().plusDays(7), aluguel.getDataDevolucao());

    }

    @InjectMocks
    private AluguelService aluguelService;
    @Mock
    private VeiculoService veiculoService;
}


