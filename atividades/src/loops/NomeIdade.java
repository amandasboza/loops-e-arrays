package loops;
import java.util.Scanner;

public class NomeIdade {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("nome: ");
            nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("idade: ");
            idade = scan.nextInt();

            if (idade >= 59) break;
        
        }

        System.out.println("Continue aqui com as operações (...)");
}
    }
