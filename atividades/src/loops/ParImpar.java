package loops;
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int número = 0;
        int quantidade; 
        int quantidadePares = 0; 
        int quantidadeImpares = 0;


        System.out.println("Olá! Quantos números você vai digitar? ");
        quantidade = scan.nextInt();

        do {
            System.out.println("Me diz um número: ");
            número = scan.nextInt();

            if (número % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            quantidade--;

        } while (quantidade != 0);

        System.out.println("Numeros de pares: " + quantidadePares);
        System.out.println("Numeros de impares: " + quantidadeImpares);

    }
    
}


// Só não tinha conseguido pensar em uma forma de fazer o par ou impar. O resto foi bem tranquilo. 