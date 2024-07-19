package dio.springboot;

import com.google.gson.Gson;
import dio.springboot.app.JsonConversor;
import dio.springboot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstStepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStepsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(JsonConversor conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Av Yamal\", \"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP:" + response);
			System.out.println(response.getCep());
		};
	}


}
