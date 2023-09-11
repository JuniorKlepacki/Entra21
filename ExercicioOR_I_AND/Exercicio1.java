package ExercicioOR_I_AND;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva uma letra ");
        String letra = entrada.next();
        //letra minuscula 
        
        letra = letra.toLowerCase();
         letra = letra.toUpperCase();
       
        //processo
        
        
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("Você digitou uma vogal"); 
        } else {
            System.out.println("Você digitou uma consoante");
        }
    }
}