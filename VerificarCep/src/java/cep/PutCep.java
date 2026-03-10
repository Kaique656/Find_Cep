package java.cep;

public class PutCep {
    private String cep;

    public PutCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "java.gson.cep.PutCep{" +
                "java.gson.cep='" + cep + '\'' +
                '}';
    }
}
