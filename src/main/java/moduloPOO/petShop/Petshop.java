package moduloPOO.petShop;

import java.util.*;

public class Petshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[5];
        ArrayDeque<String> fila = new ArrayDeque<>();

        int opcao = -1;
        int total = 0;

        while (opcao != 0) {

            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pet pelo nome");
            System.out.println("4 - Listar espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo");
            System.out.println("7 - Executar serviços");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:
                        if (total >= pets.length) {
                            System.out.println("Limite de pets atingido.");
                            break;
                        }

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Espécie: ");
                        String especie = sc.nextLine();

                        System.out.print("Peso: ");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Pet pet;

                        if(especie.equalsIgnoreCase("Cachorro")){
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            pet = new Gato();
                        }else {
                            pet = new Pet();
                        }

                        pet.nome = nome;
                        pet.especie = especie;
                        pet.peso = peso;

                        System.out.println("Porte: " + pet.definirPorte(pet.peso));
                        pet.emitirSom();

                        pets[total] = pet;
                        total++;

                        System.out.println(
                                " Pet cadastrado! Agora são "
                                        + total + " pet(s)."
                        );
                        break;
                    case 2:
                        System.out.println("\n=== PETS CADASTRADOS ===");

                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("\n--- PETS CADASTRADOS ---");

                            for (int i = 0; i < total; i++) {
                                System.out.printf(
                                        "%s (%s) - %.1f kg - Porte %s%n",
                                        pets[i].nome,
                                        pets[i].especie,
                                        pets[i].peso,
                                        pets[i].porte
                                );

                                pets[i].emitirSom();
                            }

                            mostrarFicha(pets[0]);

                            System.out.println("---");

                            mostrarFicha(pets[0], "=== FICHA DO PET ===");
                        }
                        break;
                    case 3:
                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (pets[i].nome.equalsIgnoreCase(busca)) {
                                System.out.printf(
                                        "Encontrado: %s (%s) - %.1f kg%n",
                                        pets[i].nome,
                                        pets[i].especie,
                                        pets[i].peso
                                );

                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(pets[i].especie);
                        }

                        if (especies.isEmpty()) {
                            System.out.println("Nenhuma espécie cadastrada.");
                        } else {
                            System.out.println("\n--- ESPÉCIES CADASTRADAS ---");

                            for (String especieCadastrada : especies) {
                                System.out.println("- " + especieCadastrada);
                            }

                            System.out.println(
                                    "Total de espécies diferentes: " + especies.size()
                            );
                        }
                        break;
                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomePet = sc.nextLine();

                        fila.add(nomePet);

                        System.out.println(nomePet + " entrou na fila.");
                        System.out.println("Fila agora: " + fila);
                        break;
                    case 6:
                        if (fila.isEmpty()) {
                            System.out.println("Não há pets na fila de banho.");
                        } else {
                            String proximo = fila.peek();

                            System.out.println("Próximo da fila: " + proximo);

                            String atendido = fila.poll();

                            System.out.println("Atendendo " + atendido + "...");
                            System.out.println("Fila agora: " + fila);
                        }
                        break;
                    case 7:
                        System.out.print("Nome do pet: ");
                        String nomePetServico = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();

                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico servico : servicos) {
                            servico.executar(nomePetServico);
                        }

                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            }catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }


    }

    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    static void mostrarFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + " kg");
        System.out.println("Porte: " + pet.porte);
    }
}
