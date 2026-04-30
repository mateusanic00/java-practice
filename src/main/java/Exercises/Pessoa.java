package Exercises;

public class Pessoa {
    private String nome;
    private float saldo;
    private String cpf;

    public Pessoa (String nome, String cpf, float saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    public void ShowSaldo(){ System.out.println(saldo); }
    public boolean comprar (Produto produto, int quantidade){

        float valorTotal = produto.GetPreco() * quantidade;

        if (valorTotal > saldo){
            System.out.println("Saldo insuficiente!");
            return false;
        }
       boolean vendido = produto.Buy(quantidade);

        if (vendido){
            saldo -= valorTotal;
            System.out.println("Parabéns " + nome + ", sua compra foi efetuada com sucesso!" );
            System.out.println("O valor da compra foi de R$" + valorTotal);
            return true;
        }
        System.out.println("Estoque insuficiente, volte mais tarde.");
        return false;
}
}
