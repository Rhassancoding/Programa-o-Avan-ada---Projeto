package com.mycompany.gamequiz.x;

import java.util.Scanner;

public class GameQuiz implements Jogador {

    @Override
    public void Apelido() {
        System.out.println("\nEntre com um Apelido:\n");
        Scanner in = new Scanner(System.in);
        String Apelido;
        Apelido = in.next();
    }

    @Override
    public void Idade() {
        System.out.println("\nDigite sua Idade:\n");
        Scanner in = new Scanner(System.in);
        int Idade;
        Idade = in.nextInt();
    }

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t-----------------------------Starting the GAMEQUIZ 1.0----------------------------\n");

        GameQuiz c = new GameQuiz();
        c.Apelido();
        c.Idade();

        Perguntas t= new Perguntas();
        t.Temas();
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Perguntas n1 = new Perguntas();
                n1.Niveis();
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        Perguntas f = new Perguntas();
                        f.PerguntaseasyTI();
                        break;
                    case 2:
                        Perguntas m = new Perguntas();
                        m.PerguntasmedTI();
                        break;
                    case 3:
                        Perguntas h = new Perguntas();
                        h.PerguntashardTI();
                        break;
                    default:
                        System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");

                }
                break;
            case 2:
                Perguntas n2 = new Perguntas();
                n2.Niveis();
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        Perguntas l1 = new Perguntas();
                        l1.PerguntaseasyGames();
                        break;
                    case 2:
                        Perguntas l2 = new Perguntas();
                        l2.PerguntasmedGames();
                        break;
                    case 3:
                        Perguntas l3 = new Perguntas();
                        l3.PerguntashardGames();
                        break;
                    default:
                        System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");

                }

                break;
            case 3:
                Perguntas n3 = new Perguntas();
                n3.Niveis();
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        Perguntas l = new Perguntas();
                        l.PerguntaseasyFilmes();
                        break;
                    case 2:
                        Perguntas l2 = new Perguntas();
                        l2.PerguntasmedFilmes();
                        break;
                    case 3:
                        Perguntas l3 = new Perguntas();
                        l3.PerguntashardFilmes();
                        break;
                    default:
                        System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");
                }
                break;
            default:
                System.out.println("\nOPa infelizmente não existe esta opcao!!!!!\n");
        }
    }
}
