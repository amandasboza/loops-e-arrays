import java.util.Scanner;

public class MaiorMédia {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero; 

        int conta = 0;
        int maior = 0;
        
        int soma = 0;
        
        do {

            System.out.println("numero :");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            conta++;
    
        } while (conta < 5);

        System.out.println("Maior número é " + maior);
        System.out.println("Minha média é " + (soma/5));

    }
}
