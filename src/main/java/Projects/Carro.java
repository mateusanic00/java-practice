package Projects;

public class Carro {
    private String nome;
    private int velocidade;

    public Carro (String nome , int velocidade){
        this.nome = nome;
        this.velocidade = velocidade;
    }
    public void Acelerar (int incremento){
        this.velocidade += incremento;
        System.out.println("Você acelerou o " + nome + " agora ele está à " + velocidade + " Km/h");
    }
    public void Frear (int decremento){
        this.velocidade -= decremento;
        System.out.println("Você freou o " + nome + " agora ele está à " + velocidade + " Km/h");
    }
}
