package Car_classes_List;

public class Sedan extends Carro {
    private int portas;

    public Sedan(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }
}
