package Projects;

public class mainProduto {
    public static void main (String... args){
        Produto jarra = new Produto("Jarra", 49.50, 10);
        jarra.addAmount(2);
        jarra.removeAmount(2);
        jarra.ShowStatus();
    }
}
