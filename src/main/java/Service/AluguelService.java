package Service;

import Model.Aluguel;
import Model.Veiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AluguelService {


    private static List<Aluguel> aluguelList = new ArrayList<>();

    private VeiculoService veiculoServiceService = new VeiculoService();

    public static Aluguel cadastrarAluguel(String a3369J8, String astra, boolean b) {
    }

    public <veiculo> Aluguel cadastrarVeiculo(String modelo, String placa) {
        VeiculoService veiculoService = null;
        veiculo veiculo = veiculoService.buscaVeiculo(placa);
        if (veiculo == null) {
            return null;
        }


        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(7);

        Veiculo veiculoAlugado = null;
        Aluguel aluguel = new Aluguel(veiculoAlugado, dataEmprestimo, dataDevolucao);
        aluguel.add(aluguel);
        return aluguel;
    }

    public static List<Aluguel> listarAluguel() {
        return aluguelList;
    }

    public static boolean finalizarAluguel(String placa) {
        Optional<Aluguel> aluguelOptional = aluguelList
                .stream()
                .filter(e -> e.getVeiculoAlugado().isDisponivel().getplaca().equals(placa)) //Não entendi porque não veio o getplaca
                .findFirst();

        Optional<Object> aluguel = null;
        if (aluguel.isPresent()) {
            Aluguel aluguel1 = (Aluguel) aluguel.get();
            aluguel.remove(aluguel); //não entendi porque  nõa habilitou o remove
            return true;
        }
        return false;
    }


    public static Aluguel cadastrarAluguel() {
        return null;
    }
}

