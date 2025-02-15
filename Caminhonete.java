package Car_classes_List;

public class Caminhonete extends Carro {
    private String capacidadeCarga;

    public Caminhonete(String marca, String modelo, int ano, String capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }
}
