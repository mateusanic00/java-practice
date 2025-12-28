package Projects;

public class mainPessoa {
    public static void main (String... args){
        Pessoa Junior = new Pessoa("Syloe", "111.111.111.11", 1000000000);
        Produto relogio = new Produto("Relógio", 2500000, 1);
        Junior.comprar(relogio, 2);
        Junior.ShowSaldo();
    }
}
