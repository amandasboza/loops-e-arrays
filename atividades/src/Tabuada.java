import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        System.out.println("Quero ver a tabuada de? ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {

            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

        }
    }
}

// i é o contador;
// O primeiro é o valor inicial do contador;
// O seguindo é o limite do contador;
// O terceiro é o incremento do contador;