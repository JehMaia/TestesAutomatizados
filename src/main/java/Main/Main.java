package Main;

import Model.Aluguel;
import Model.Veiculo;
import Service.AluguelService;
import Service.VeiculoService;

import java.util.List;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            AluguelService alugeulService = new AluguelService();
            VeiculoService VeiculoService = new VeiculoService();


            String opcao;
            while (true) {

                System.out.println("1 para Cadastrar Veiculo");
                System.out.println("2 para Listar Veiculo");
                System.out.println("3 para Buscar Veiculo");
                System.out.println("4 para Cadastrar Aluguel");
                System.out.println("5 para Listar Aluguel");
                System.out.println("6 para Buscar Aluguel");


                opcao = scanner.nextLine();
                if (opcao.equals("1")) {
                    System.out.println("Digite a marca do Veiculo a ser cadastrado::");
                    String marca = scanner.nextLine();

                    System.out.println("Digite a placa:");
                    String placa = scanner.nextLine();


                    Veiculo veiculo = VeiculoService.cadastrarveiculo("modelo", "placa");
                    if (veiculo != null) {
                        System.out.println("veiculo cadastrada com sucesso");
                    } else {
                        System.out.println("Erro ao cadastrar o veiculo.");
                    }
                }

                if (opcao.equals("2")) {
                    List<Veiculo> veiculos = VeiculoService.listarVeiculos();
                    veiculos.forEach(p -> System.out.println(p.getmodelo() + " " + p.getPlaca()));
                }

                if (opcao.equals("3")) {
                    System.out.println("Digite a placa: ");
                    String cpf = scanner.nextLine();

                    Veiculo veiculo = VeiculoService.buscarVeiculo(("placa");
                    if (veiculo != null) {
                        System.out.println(veiculo.getmodelo() + " " + veiculo.getPlaca());
                    } else {
                        System.out.println("Veiculo não encontrado.");
                    }
                }
            }

            if (opcao.equals("4")) {
                System.out.println("Digite a placa");
                String cpf = scanner.nextLine();

                System.out.println("Digite o Modelo:");
                String codigo = scanner.nextLine();

                Aluguel aluguel = AluguelService.cadastrarAluguel("A3369J8", "Astra", true);
                if (aluguel != null) {
                    System.out.println(aluguel.getVeiculoAlugado() + " " + aluguel.getDataEmprestimo() + " " + aluguel.getDataDevolucao());
                } else {
                    System.out.println("Erro no cadastro do aluguel.");
                }
            }

            if (opcao.equals("5")) {
                List<Aluguel> aluguel = AluguelService.listarAluguel();
                aluguel.forEach(e -> System.out.println(e.getVeiculoAlugado() + " " + e.getDataEmprestimo() + " " + e.getDataDevolucao()));
            }

            if (opcao.equals("6")) {
                System.out.println("Digite a placa do veiculo:");
                String cpf = scanner.nextLine();

                boolean funcionou = AluguelService.finalizarAluguel("A3369J8");
                if (funcionou) {
                    System.out.println("Aluguel finalizado com sucesso");
                } else {
                    System.out.println("Erro ao finalizar o aluguel");
                }
            }


        }


        }

    }
}
