import java.util.Scanner;

public class NotaValida {
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("nota");
        nota = scan.nextInt();
               
        while (nota < 0 || nota > 10) {
            System.out.println("Nota Inválida, digite novamente:");
            nota = scan.nextInt();
        }
    }
}


/* Eu havia resolvido esse problema de forma diferente: 
 * 
 *       while (true) {
 * 
 *       System.out.println("nota");
 *       nota = scan.nextInt();
 * 
 *       if (nota < 0 || nota > 10) {
 *          System.out.println("Nota Inválida, digite novamente:");
 *  *       nota = scan.nextInt();
 *       }
 *       else {
 *       break;
 *      }
 * }
 * 
 *  Preferi seguir com o exemplo da professora, porque assim não foi necessário entrar no white para fazer a verificação.
 * 
 */