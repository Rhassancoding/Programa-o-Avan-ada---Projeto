
package com.mycompany.gamequiz.x;
import java.util.Scanner;
public class Client implements  Jogador{
 
        @Override
    public void Apelido() {
            System.out.println("\nEntre com um Apelido:\n");
            Scanner in = new Scanner(System.in);
            String apelido;
            apelido =in.next();
    }

    @Override
    public void Genero() {
            System.out.println("\nEntre com um Genero:\n");
            Scanner in = new Scanner(System.in);
            String genero;
            genero =in.next();
    }

    @Override
    public void Points() {
            System.out.println("\nEntre com a sua última pontuação:\n");
            Scanner in = new Scanner(System.in);
            String apelido;
            apelido =in.next();
    }

    public static void main(String[] args) {
      int opcao;Scanner sc= new Scanner(System.in);
        System.out.println("\n\t-----------------------------Starting the GAMEQUIZ 1.0----------------------------\n");
       
        Client c =new Client();
         c.Apelido();
         c.Genero();
         c.Points();
         
         
        Temas t = new Temas();
        t.Assuntos();
        opcao = sc.nextInt();
        
          switch(opcao){
            case 1:
                  Level n1 = new Level();
                  n1.Niveis();
                   opcao = sc.nextInt();
                     switch(opcao){
                         case 1:
                         Level f = new Level();
                              f.PerguntasfacilTI();
                             break;
                         case 2 :
                         Level m= new Level();
                         m.PerguntasmedTI();
                             break;
                         case 3:
                         Level h= new Level();
                         h.PerguntashardTI();
                             break;
                         default: System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");        
                         
                     }
                break;
            case 2:
                Level n2 = new Level();
                  n2.Niveis();
                 opcao = sc.nextInt();
                      switch(opcao){
                         case 1:
                                Level l1 = new Level();
                                l1.PerguntasfacilGames();
                             break;
                         case 2 :
                               Level l2 = new Level();
                               l2.PerguntasmedGames();
                             break;
                         case 3:
                             Level l3 = new Level();
                             l3.PerguntashardGames();
                             break;
                         default: System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");        
                         
                     }   
                  
                break;
            case 3 :
                    Level n3 = new Level();
                    n3.Niveis();     
                     opcao = sc.nextInt();
                     switch(opcao){
                         case 1:
                            Level l =new Level();
                            l.PerguntasfacilFilmes();
                             break;
                         case 2 :
                              Level l2 = new Level();
                              l2.PerfuntasmedFilmes();
                             break;
                         case 3:
                             Level l3 = new Level();
                             l3.PerguntashardTI();
                             break;
                         default: System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");                         
                     }  
                break;
                default: 
                    System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");  
        }
    }
}
