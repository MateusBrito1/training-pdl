import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlgoritmoPDL {

    void myElo() {
        int pdl = 10;
        String win = "win";
        String loss = "loss";
        System.out.print("Win or loss?");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String userInput = sc.next();
            // Se conter 'win' no input, ele vai incrementar 10 de pdl
            if (win.equals(userInput)) {
                pdl += 10;
                System.out.println("Você ganhou: " + pdl);
            } else if (loss.equals(userInput)) {
                pdl -= 15;
                System.out.println("Você perdeu: " + pdl);
            } else {
                System.out.println("Entrada invalida.");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        AlgoritmoPDL instance = new AlgoritmoPDL();
        instance.myElo();

        Map<String, Integer> elo = new HashMap<>();
        elo.put("Diamante", 100);
        elo.put("Master", 200);

        for (Map.Entry<String, Integer> entry : elo.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("O Elo dele é " + key + " e os pdl dele são: " + value);

            if (elo.containsValue(300)) {
                System.out.println("Você passou no teste");
            } else {
                System.out.println("Não passou no teste");
            }
        }
    }

    @Override
    public String toString() {
        return "AlgoritmoPDL []";
    }
}