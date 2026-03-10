import java.cep.PutCep;

import java.gson.Json;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner key = new Scanner(System.in);
        System.out.println("Digite o seu java.gson.cep");
        String digite = key.nextLine();
        try {
            PutCep cep = new PutCep(digite);
            Json json = new Json();
            System.out.println(json.getGson(cep));
            } catch (IOException e ){
            System.out.println("Nao foi possivel acessar seu java.gson.cep");
            System.out.println(e.getMessage());
        }
        }
}