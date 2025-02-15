package Car_classes_List;

public class Esportivo extends Carro {
    private int velocidadeMaxima;

    public Esportivo(String marca, String modelo, int ano, int velocidadeMaxima) {
        super(marca, modelo, ano);
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
