package Car_classes_List;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarroService {
    private List<Carro> listaDeCarros = new ArrayList<>();

    public CarroService() {
        listaDeCarros.add(new Sedan("Toyota", "Corolla", 2022, 4));
        listaDeCarros.add(new SUV("Jeep", "Compass", 2023, "4x4"));
        listaDeCarros.add(new Esportivo("Ferrari", "F8 Tributo", 2021, 340));
        listaDeCarros.add(new Caminhonete("Ford", "F-150", 2020, "1000kg"));
    }

    public List<Carro> getListaDeCarros() {
        return listaDeCarros;
    }
}
