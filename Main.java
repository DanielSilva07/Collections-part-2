import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String resposta1;

        System.out.println("Digite seu nome e gênero: " + "\n" + " Ex: Rodrigo-m");
        resposta1 = s.next();

        List<String> grupoMasculino = new ArrayList<>();

        List<String> grupoFeminino = new ArrayList<>();

        if (resposta1.contains("-m")){
            grupoMasculino.add(resposta1);
        }
        else if (resposta1.contains( "-f")){
            grupoFeminino.add(resposta1);
        }

        System.out.println(Arrays.toString(resposta1.split("-")));
        System.out.println(grupoFeminino);
        System.out.println(grupoMasculino);

    }
}