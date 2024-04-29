package logica;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        int somaIdades = 0;
        int contador = 0;
        
        System.out.println("Digite as idades (digite 0 para finalizar):");
        
        do {
            idade = scanner.nextInt();
            
            // Se a idade digitada for diferente de 0, adiciona à soma e incrementa o contador
            if (idade != 0) {
                somaIdades += idade;
                contador++;
            }
            
        } while (idade != 0);
        
        // Calcula a média das idades
        double mediaIdades = (double) somaIdades / contador;
        
        System.out.println("A média das idades é: " + mediaIdades);
        
        scanner.close();
    }
}
