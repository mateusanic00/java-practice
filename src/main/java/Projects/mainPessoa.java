package Projects;

public class mainPessoa {
    public static void main (String... args){
        Pessoa pessoa1 = new Pessoa("Mateus", "111.111.111.11", 100000);
        Produto sapato = new Produto("Sapato", 600, 6660);
        pessoa1.comprar(sapato, 2);
        pessoa1.ShowSaldo();
    }
}
