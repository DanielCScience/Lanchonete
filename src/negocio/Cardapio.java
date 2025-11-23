package negocio;

import java.util.ArrayList;

public class Cardapio {

    ArrayList<Produto> cardapio = new ArrayList<>();

    public Cardapio() {
    }

    public ArrayList<Produto> getCardapio() {
        return cardapio;
    }

    public void setCardapio(ArrayList<Produto> cardapio) {
        this.cardapio = cardapio;
    }

    public void adicionarProduto(Produto produtotipo){

        cardapio.add(produtotipo);
    }

    public void procurarprodutoid(int id){
        for (Produto i: cardapio){
            if (i.getId()==id){
                System.out.println("Produto Encontrado: ");
                System.out.println(i.gerarDescricao());
            }
        }
        System.out.println("Nenhum produto encontrado: ");
    }


    public void listarProdutos(){
        if (cardapio.isEmpty()){
            System.out.println("O cardápio está vazio.");
            return;
        }

        for (Produto p: cardapio){
            System.out.println(p.getNome() + "|" + p.gerarDescricao());
        }

    }

    public void removerProduto(int id) {
        for (Produto p : cardapio) {
            if (p.getId() == id) {
                cardapio.remove(p);
                System.out.println("Produto removido com sucesso.");

                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }




}