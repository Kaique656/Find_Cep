package java.gson;

import java.cep.Cidade;
import java.cep.ConsultAPI;
import java.cep.PutCep;
import com.google.gson.Gson;

import java.io.IOException;

public class Json {
    private Gson gson;

    public Cidade getGson( PutCep cep) throws IOException, InterruptedException {
        ConsultAPI c = new ConsultAPI();
        this.gson = new Gson();
        String p =  c.api(cep);
        Cidade cidade = gson.fromJson(p, Cidade.class);
        return cidade;
    }
}
