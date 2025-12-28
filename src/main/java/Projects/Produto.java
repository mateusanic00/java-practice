package Projects;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public void addAmount (int qtd) {
        if (qtd > 0){
            quantidade = qtd += quantidade;
        }
    }

    public boolean removeAmount (int qtd){
        if (qtd > quantidade){
            return false;
        } else {
            quantidade = qtd -= quantidade;
            return true;
        }
    }

}
