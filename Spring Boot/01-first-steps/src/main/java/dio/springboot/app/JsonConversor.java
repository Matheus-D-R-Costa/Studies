package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class JsonConversor {

    private final Gson gson;

    public JsonConversor(Gson gson) {
        this.gson = gson;
    }

    public ViaCepResponse converter(String json) {
        return gson.fromJson(json, ViaCepResponse.class);
    }
}
