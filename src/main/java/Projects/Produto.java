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

    public void ShowStatus(){
        System.out.println("Produto: " + nome + "\n" +
                            "Preco: " + preco + "\n" +
                            "Quantidade em estoque: " + quantidade);
    }

    public void addAmount (int qtd) {
        if (qtd > 0){
            quantidade = qtd += quantidade;
        }
    }

    public boolean removeAmount (int qtd){
        if (qtd > 0 && qtd >= quantidade){
            return false;
        } else {
            quantidade = quantidade -= qtd;
            return true;
        }
    }
    public double GetPreco(){ return preco; }
    public boolean Buy(int qtdCompra){ return removeAmount(qtdCompra);}

}
