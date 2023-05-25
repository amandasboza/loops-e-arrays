package loops;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contador = 0;
        
        do {

        System.out.println("Por favor digite uma letra:");
        String letra = scan.next();

        if( !(letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }

            contador++;

        } while(contador < (consoantes.length));

        
        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);
               
    }
}