package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Veiculo {


        private String modelo;
        private String placa;
        private boolean Status;

        public void add(Veiculo veiculo) {
        }


        public Object getmodelo() {
                return null;
        }

        public boolean getStatus() {
                return false;
        }

        public Object isDisponivel() {
                return null;
        }
}
