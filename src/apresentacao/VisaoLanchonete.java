package apresentacao;

import negocio.Bebida;
import negocio.Cardapio;
import negocio.Hamburguer;
import negocio.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class VisaoLanchonete {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        int opcao = -1;
        Cardapio cardapiocriado = new Cardapio();

        while(opcao != 0){
            System.out.println("===== MENU LANCHONETE =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto por ID");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine();



            switch (opcao) {
                case 1:
                    System.out.println("Deseja cadastrar hambúrguer ou bebida?");
                    String opcaocadastro = leitor.nextLine().trim().toUpperCase();



                    if (opcaocadastro.equalsIgnoreCase("Hamburguer")){

                        System.out.println("Qual o id do hambúrguer: ");
                        int id = leitor.nextInt();
                        leitor.nextLine();

                        System.out.println("Digite o nome do Hamburguer: ");
                        String nome = leitor.nextLine().toUpperCase();

                        System.out.println("Digite o preço: ");
                        double preco = leitor.nextDouble();
                        leitor.nextLine();

                        System.out.println("Digite os ingredientes: ");
                        ArrayList<String> ingredientes = new ArrayList<>();

                        System.out.println("Digite a quantidade de ingredientes do hambúrguer: ");
                        int quantidade = leitor.nextInt();
                        leitor.nextLine(); // limpar buffer

                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Digite o ingrediente " + (i + 1) + ": ");
                            String nomeIngrediente = leitor.nextLine();
                            ingredientes.add(nomeIngrediente);
                        }

                        Produto cadastro = (new Hamburguer(id,nome, preco, ingredientes));
                        System.out.println("Cadastro realizado om sucesso!");

                        cardapiocriado.adicionarProduto(cadastro);

                        System.out.println("Cadastro realizado com sucesso!");


                    }

                    if (opcaocadastro.equalsIgnoreCase("Bebida")){

                        System.out.println("Qual o id da bebida: ");
                        int id = leitor.nextInt();
                        leitor.nextLine();

                        System.out.println("Digite o nome da bebida: ");
                        String nome = leitor.nextLine().trim().toUpperCase();

                        System.out.println("Digite o preço: ");
                        double preco = leitor.nextDouble();
                        leitor.nextLine();

                        System.out.println("Digite o tamanho em 'ml': ");
                        int quantidade = leitor.nextInt();
                        leitor.nextLine();

                        Produto cadastro = new Bebida(id, nome, preco, quantidade);
                        cardapiocriado.adicionarProduto(cadastro);

                        System.out.println("Cadastro realizado com sucesso!");


                    }
                    break;

                case 2 :
                    cardapiocriado.listarProdutos();
                    break;
                case 3:
                    System.out.println("Digite o id do produto que deseja: ");
                    int id = leitor.nextInt();
                    leitor.nextLine();

                    cardapiocriado.procurarprodutoid(id);
                    break;

                case 4:
                    System.out.println("Digite o id do produto que deseja remover: ");
                    int removerid = leitor.nextInt();
                    leitor.nextLine();

                    cardapiocriado.removerProduto(removerid);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;

            }
        }
    }
}
