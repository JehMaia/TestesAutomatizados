package Service;

import Model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VeiculoService {


    private static List<Veiculo> veiculos = new ArrayList<>();

    public static Object buscaveiculo(String a3369J8) {
        return null;
    }

    public static Object buscarveiculo(String a3369J8) {
        return null;
    }

    public Veiculo cadastrarVeiculo (String modelo, String placa, boolean status ) {
        if (modelo == null || modelo.isEmpty()) {
            return null;
        }
        if (placa == null || placa.isEmpty()) {
            return null;
        }
        if (status == false) {
            return null;
        }

        Veiculo veiculo = new Veiculo(modelo, placa, true);
        veiculo.add(veiculo);

        Veiculo Veiculo = new Veiculo();
        return Veiculo;
    }

    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }

    public Veiculo buscarVeiculo (String placa) {
        Optional<Veiculo> veiculo = veiculos
                .stream()
                .filter(l -> l.getPlaca().equals(placa))
                .findFirst();
        if (veiculo.isPresent()) {
            return veiculo.get();
        }
        return null;
    }

    public <veiculo> veiculo buscaVeiculo(String placa) {
        return null;
    }
}

