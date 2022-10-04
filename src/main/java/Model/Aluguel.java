package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;



    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public class Aluguel {



        private Veiculo veiculoAlugado;
        private LocalDate dataEmprestimo;
        private LocalDate dataDevolucao;

        public void add(Aluguel aluguel) {
        }


    }

