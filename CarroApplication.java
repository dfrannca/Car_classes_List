package Car_classes_List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

@SpringBootApplication
public class CarroApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CarroApplication.class, args);
        CarroService carroService = context.getBean(CarroService.class);

        List<Carro> carros = carroService.getListaDeCarros();
        carros.forEach(carro -> System.out.println(carro.exibirInfo()));
    }
}
