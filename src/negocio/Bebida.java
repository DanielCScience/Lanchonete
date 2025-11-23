package negocio;

import java.text.NumberFormat;
import java.util.Locale;

public class Bebida  extends Produto{


    private int ml;


    public Bebida(){}

    public Bebida(int id, String nome, double preco, int ml) {
        super(id, nome, preco);
        this.ml = ml;

    }

    public double getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }



    @Override
    public void calcularPrecoFinal() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Total: " + formatador.format(getPreco()));
    }

    @Override
    public String gerarDescricao() {
        return getId() + " - " + getNome() +
                " | Volume: " + getMl() + "ml";
    }

}
