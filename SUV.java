package Car_classes_List;

public class SUV extends Carro {
    private String tracao;

    public SUV(String marca, String modelo, int ano, String tracao) {
        super(marca, modelo, ano);
        this.tracao = tracao;
    }
}
