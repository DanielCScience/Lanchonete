package negocio;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Hamburguer extends Produto {

    private ArrayList<String> ingredientes = new ArrayList<>();

    public Hamburguer() {}

    public Hamburguer(int id, String nome, double preco, ArrayList<String> ingredientes) {
        super(id, nome, preco);
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public void calcularPrecoFinal() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Total: " + formatador.format(getPreco()));
    }

    @Override
    public String gerarDescricao() {
        return getId() + " - " + getNome() +
                " | Ingredientes: " + String.join(", ", ingredientes);
    }
}
