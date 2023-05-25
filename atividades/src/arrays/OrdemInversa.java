package arrays;
public class OrdemInversa {
    
    public static void main(String[] args) {
        
        int contador = 0;

        int[] vetor = {8, -5, 15, 50, 9, -7};

        while(contador < vetor.length) {

            System.out.println(vetor[contador]);
            contador++;
        }

        for(contador = (vetor.length-1); contador >= 0; contador--) {
            System.out.println(vetor[contador] + " ");
        };
    }
};

