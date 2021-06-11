
package com.mycompany.gamequiz;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {
        int resposta;Scanner input = new Scanner(System.in);
        System.out.println("\n\t-----------------------------Starting the GAMEQUIZ 1.0----------------------------\t");
        System.out.println("Ecolha o tema que desejas:\n 1-Perguntas sobre TI\n2-Perguntas sobre Filmes\n3-Perguntas sobre Games");
             resposta = input.nextInt();
        switch(resposta){
            case 1:
            
                 
                break;
            case 2:
                    
                break;
            case 3 :
                PerguntasGames g = new PerguntasGames();
                 g.PerguntaFacil();               
                break;
                default: 
                    System.out.println("\nOPa infelizmente não existe esta opcao!!!!!");  
        }
         
          
        
    }
    
}
