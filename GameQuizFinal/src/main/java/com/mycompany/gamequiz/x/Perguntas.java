package com.mycompany.gamequiz.x;

import java.util.Scanner;

public class Perguntas extends Estrutura {
    // String respostaTi,repostaGame,respostaFilmes,Points;
    private int Points = 0; 
    void Niveis() {
        System.out.println("\n-------Esses são os Niveis-------\n1-Facil\n2-Medio\n3-Dificil");
    }
    void Temas(){System.out.println("\n-------Esses são os Temas-------\n1-Tecnologia\n2-Games\n3-Filmes");
      }
    void PerguntaseasyTI() {
        Scanner respostaTi = new Scanner(System.in);
            Points = 0;
        String res;
        System.out.println("\n----Theme is Tecnologia ---\n Mod:Easy\n 1.Qual destes passwords foi o mais usado na internet?\n" + "\n" + "a)a1b2c3\n" + "b)adcdef\n" + "c)123456\n ");
        res = respostaTi.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }
        System.out.println("\n2.O que significa a sigla “www” na internet\n" + "\n" + "a)World wide web\n" + "b)Web World wide\n" + "c)Web wide World\t\t z<-Para Voltar\n");
        res = respostaTi.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyTI();
            break;
        }

        System.out.println("\n3.Qual foi o primeiro tweet da história?\n" + "\n" + "a)“Olá, twitter”\n" + "b)“Olá, mundo”\n" + "c)“Estou preparando meu twitter\t\tz<-Para Voltar”\n");
        res = respostaTi.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyTI();
            break;
        }

        System.out.println("\n4.Qual foi a primeira rede social da história da Internet?\n" + "\n" + "a)Classmate\n" + "b)MySpace\n" + "c)Orkut\t\tz<-Para Voltar\n");
        res = respostaTi.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyTI();
            break;
        }

        System.out.println("\n5.Quantos bits cabem em um byte? \n" + "\n" + "a)8 bits\n" + "b)1 bit\n" + "c)12 bits\nz<--- Para Voltar\n");
        res = respostaTi.next();
        if (res.equals("a")) {
            Points = Points + 1;
         System.out.println("---Mod easy finish--- Points: " + Points);
        }
        
        while (res.equals("z")) {
            PerguntaseasyTI();
            break;
        }

    }

    void PerguntaseasyGames() {
        Scanner opcao = new Scanner(System.in);
         Points = 0;
        
        String res;
        System.out.println("\n----Theme is Games ---\n Mod:Easy\n 1-Qual era o nome antigo do Mario?\n" + "a)Luigi\n" + "b)Shigeru\n" + "c)Sempre foi Mario\n" + "d)Jumpman\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("d")) {
            Points = Points + 1;
        }

        System.out.println("\n2-Qual foi o primeiro jogo de Lego lançado?\n" + "a)Star Wars\n" + "b)Batman\n" + "c)Indiana Jones\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyGames();
            break;
        }

        System.out.println("\n3-Antes do lançamento de GTA V, rolou um baixo assinado pedindo para a Rockstar lançar GTA V para que plataforma além do Xbox 360 e PS3?\n" + "a)PC\n" + "b)Wii U\n" + "c)PS4 e Xbox One\n" + "d)3ds\t\tPara Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyGames();
            break;
        }

        System.out.println("\n4-Qual é a empresa do Megaman?\n" + "a)Nintendo\n" + "b)Activision\n" + "c)THQ\n" + "d)Capcom\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("d")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyGames();
            break;
        }

        System.out.println("\n5-Qual foi o console mais vendido do mundo?\n" + "a)PS2\n" + "b)Wii\n" + "c)Atari\n" + "d)Xbox 360\t\tz<-Para Voltar");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
          System.out.println("---Mod easy finish--- Points: " + Points);
        }
       
        while (res.equals("z")) {
            PerguntaseasyGames();
            break;
        }
    }

    void PerguntaseasyFilmes() {
        Scanner opcao = new Scanner(System.in);
         Points = 0;
        String res;
        System.out.println("\n----Theme is Filmes ---\n Mod:Easy\n 1.Qual esporte praticado em Hogwarts?\n" + "a)Basquete\n" + "b)Futebol\n" + "c)Quadribol\t\tz<=Para Voltar\n");
        res = opcao.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }
        System.out.println("\n2.Qual personagem do seriado CHAVES mora numa casa de número 71?\n" + "a)Seu Madruga\n" + "b)Dona Clotilde\n" + "c)Chaves\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals( "b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyFilmes();
            break;
        }

        System.out.println("\n3.Como o Homem aranha ganha seus poderes?\n" + "a)Ele é filho de uma aranha\n" + "b)Ele foi picado por uma aranha radioativa	\n" + "c)Ele é um alienígena\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyFilmes();
            break;
        }

        System.out.println("\n4.Qual o vilão mais famoso da franquia STAR WARS?\n" + "a)Coringa\n" + "b)Thanos\n" + "c)Darth Vader\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntaseasyFilmes();
            break;
        }

        System.out.println("\n5.Qual o nome da espada lendária do Rei Artur?\n" + "a)Excalibur\n" + "b)Sabre de Luz\n" + "c)Espada de Gryffindor\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
           System.out.println("---Mod easy finish--- Points: " + Points);
        }
       
        while (res.equals("z")) {
            PerguntaseasyFilmes();
            break;
        }

    }

    /////////////////////////////////medias/////////////////////////////////////////////
    void PerguntasmedTI() {
        Scanner opcao = new Scanner(System.in);
         Points = 0;
        String res;
        System.out.println("\n----Theme is Tecnologia---\n Mod:Medio\n 1-Versão atual do HTML?\n" + "\n" + "a)5\n" + "b)3\n" + "c)Ultra\n" + "d)8.0\t\tnz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        System.out.println("\n2-Qual a famosa região conhecida por ser um polo da tecnologia ?\n" + "\n" + "a)Imperatriz\n" + "b)Vale do Silício\n" + "c)Leste da Alemanha\n" + "d)São Paulo\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedTI();
            break;
        }

        System.out.println("\n3-Qual a ferramenta de pesquisa mais utilizada do mundo?\n" + "\n" + "a)Bing\n" + "b)Baidu Search\n" + "c)Google\n" + "d)Yahoo\t\t<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedTI();
            break;
        }

        System.out.println("\n4-Qual a linguagem conhecida por ser uma boa opção para iniciantes?\n" + "\n" + "a)Java\n" + "b)Python\n" + "c)C++\n" + "d)Ruby\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedTI();
            break;
        }

        System.out.println("\n5-Quanto às memórias, podemos afirmar que existe uma memória somente de leitura onde seus dados não são perdidos quando desligada. Estamos falando da memória:\n" + "a)DDR\n" + "b)DDR2\n" + "c)ROM\n" + "d)DDR3\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("c")) {
            Points = Points + 1;
            System.out.println("---Mod medio finish--- Points: " + Points);
        }
        while (res.equals("z")) {
            PerguntasmedTI();
            break;
        }
       

    }

    void PerguntasmedGames() {
        Scanner opcao = new Scanner(System.in);
         Points = 0;
        String res;
        System.out.println("\n----Theme is Games ---\n Mod:Medio\n 1-Qual é o nome real do Blanka do Street Fighter?\n" + "a)Jimmy\n" + "b)Jin\n" + "c)John\n" + "d)Johnny\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        System.out.println("\n2-Em que game Tails aparece pela primeira vez?\n" + "a)Sonic the Hedgehog\n" + "b)Sonic the Hedgehog 2 \n" + "c)Sonic the Hedgehog 3\n" + "d)Sonic CD\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedGames();
            break;
        }

        System.out.println("\n3-Qual destes consoles vendeu pouco?\n" + "a)Nintendo 64\n" + "b)Dreamcast\n" + "c)PSP\n" + "d)PS2\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedGames();
            break;
        }

        System.out.println("\n4-Em que ano foi lançado o primeiro Mario Kart?\n" + "a)1991\n" + "b)1992\n" + "c)1993\n" + "d)1994\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedGames();
            break;
        }

        System.out.println("\n5-Qual foi o FIFA lançado para o Wii U?\n" + "a)FIFA12\n" + "b)FIFA13\n" + "c)FIFA14\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
            System.out.println("---Mod medio finish--- Points: " + Points);
        }
       
        while (res.equals("z")) {
            PerguntasmedGames();
            break;
        }

    }

    void PerguntasmedFilmes() {
        Scanner opcao = new Scanner(System.in);
         Points = 0;
        String res;
        System.out.println("\n----Theme is Filmes ---\n Mod:Medio \n 1.Qual o nome do Anel mais poderoso da franquia ‘O senhor dos Anéis’?\n" + "\n" + "a)Aliança de casamento\n" + "b)Anel de Sauron\n" + "c)Bijuteria do Frodo\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        System.out.println("\n2.Qual a primeira regra do ‘Clube da Luta’?\n" + "\n" + "a)Não falar sobre o Clube da Luta\n" + "b)Não Lutar fora do Clube\n" + "c)Apertos de mão antes de cada luta\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals ("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedFilmes();
            break;
        }

        System.out.println("\n3.Qual o nome do veículo usado para viagens no tempo em “De volta para o Futuro’?\n" + "a)DeLorean\n" + "b)Batmóvel\n" + "c)Herbie, o Fusca Turbinado \t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedFilmes();
            break;
        }

        System.out.println("\n4.Qual o feitiço de Levitação em Harry Potter?\n" + "a)Avada Kedavra\n" + "b)Wingardium Leviosa\n" + "c)Expecto Patronum\t\tz<-Para Voltar");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntasmedFilmes();
            break;
        }

        System.out.println("\n5.Como Thanos consegue a Joia da alma em ‘Infinity War’?\n" + "a)Sacrificando Gamora em Vormir\n" + "b)Travando uma guerra em Asgard\n" + "c)Comprou na 25 de março\t\tz<-Para Voltar\n ");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
            System.out.println("---Mod medio finish--- Points: " + Points);
        }
        while (res.equals("z")) {
            PerguntasmedFilmes();
            break;
        }
          
        

    }

    //////////////////////////////////////////////Modo Dificil/////////////////////////////////////////////////////////////
    void PerguntashardTI() {
        Scanner opcao = new Scanner(System.in);
          Points = 0;   
        String res;
        System.out.println("\n----Theme is Tecnologia---\n Mod:Hard\n 1-Qual a topologia de rede é mais usada e possui um ponto central?\n" + "\n" + "a)Estrela\n" + "b)Estrela-hierárquica\n" + "c)Barramento\n" + "d)Anel\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        System.out.println("\n2-Qual o comando de rede utilizado para verificar se existe conexão entre estações de trabalho?\n" + "\n" + "a)netstat\n" + "b)ipconfig\n" + "c)ping\n" + "d)dir\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }

        System.out.println("\n3-Qual protocolo de comunicação usado para efetuar downloads de arquivos?\n" + "\n" + "a)smtp\n" + "b)ftp\n" + "c)utp\n0<--- Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardTI();
            break;
        }

        System.out.println("\n4-Os tipos de memória respectivamente associados às memórias DDR200 e DDR400 são:\n" + "a)PC1600 e PC2100.\n" + "b)PC1600 e PC3200.\n" + "c)PC2100 e PC1600.\n" + "d)PC2100 e PC3200.\n" + "e)PC2700 e PC3200.\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardTI();
            break;
        }

        System.out.println("\n5-São tipos de memória utilizadas nos computadores e classificadas como não-voláteis:\n" + "FPM, DDR3, Ea)EPROM e EDO.\n" + "FPM, Flash, b)EEPROM e DRAM.\n" + "DDR3, EPROM, c)SRAM e Flash.\n" + "ROM, EEPROM, d)Flash e PROM.\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("d")) {
            Points = Points + 1;
        }
        System.out.println("---Mod Hard finish--- Points: " + Points);
        while (res.equals("z")) {
            PerguntashardTI();
            break;
        }

    }

    void PerguntashardGames() {
        Scanner opcao = new Scanner(System.in);
        Points = 0;
        String res;
        System.out.println("\n----Theme is Games ---\n Mod:Hard\n 1-O logo do Dreamcast era vermelho porém na Europa não. De que cor era na Europa?\n" + "a)Azul\n" + "b)Verde\n" + "c)Laranja\n" + "d)Roxo\t\tz<=Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        System.out.println("\n2-Qual é a última palavra dita em COD Ghosts?\n" + "a)\"Não\"\n" + "b)\"Obrigado\"\n" + "c)\"Ghost\"\n" + "d)\"Logan\"\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("d")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardGames();
            break;
        }

        System.out.println("\n3-O jogo Sonic e Sega All Stars Racing tem um diferencial na versão do Xbox. Qual?\n" + "a)Banjo e Kazooie podem são personagens jogáveis\n" + "b)Sonic tem um segundo carro secreto\n" + "c)Você pode jogar clássicos da Sega\n" + "d)Metal Sonic é um personagem secreto\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardGames();
            break;
        }

        System.out.println("\n4-Em qual Uncharted Drake visita as cavernas de Marco Polo?\n" + "a)Uncharted\n" + "b)Uncharted 2\n" + "c)Uncharted 3\n" + "d)Uncharted do PS Vita\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardGames();
            break;
        }

        System.out.println("\n5-Qual o nome do monstro que engole os policiais locais que estavam com Leon no começo do jogo?\n" + "a)Del Lago\n" + "b)Del Rio\n" + "c)El Lago\n" + "d)The Monster\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("a")) {
            Points = Points + 1;
        }
        System.out.println("---Mod Hard finish--- Points: " + Points);
        while (res.equals("z")) {
            PerguntashardGames();
            break;
        }

    }

    void PerguntashardFilmes() {
        Scanner opcao = new Scanner(System.in);
        Points = 0;
        String res;
        System.out.println("\n----Theme is Filmes ---\n Mod:Dificil \n 1.Qual o nome do dispositivo que permite a viagem no tempo em ‘De Volta Para o Futuro’?\n" + "a)Joia do Infinito \n" + "b)Pedra Filosofal\n" + "c)Capacitor de Fluxo\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }
        System.out.println("\n2.O que tinha na caixa no final de ‘Seven- Os sete Crimes Capitais’?\n" + "a)A caixa estava vazia\n" + "b)A cabeça de uma mulher\n" + "c)Dinheiro\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals ("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardFilmes();
            break;
        }

        System.out.println("\n3.Qual o nome do algoritmo da HYDRA que prevê futuras ameaças?\n" + "a)‘Algoritmo do Google’\n" + "b)Pseudocódigo\n" + "c)Algoritmo de Zola\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("c")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardFilmes();
            break;
        }

        System.out.println("\n4.Em que dia foi lançado “Star Wars: The Empire Strikes Back?\n" + "a)4 de julho de 1888\n" + "b)21 de junho de 1980\n" + "c)15 de novembro de 1985\t\tz<-Para Voltar\n");
        res = opcao.next();
        if (res.equals("b")) {
            Points = Points + 1;
        }
        while (res.equals("z")) {
            PerguntashardFilmes();
            break;
        }

   
            System.out.println("\n5.Por quem foi dirigido A obra ‘O Poderoso Chefão’?\n" + "a)Francis Ford Coppola\n" + "b)Steven Spielberg\n" + "c)Quentin Tarantino\t\tz<-Para Voltar \n ");
            res = opcao.next();
            if (res.equals("a")) {
                Points = Points + 1;
            
        }
        System.out.println("---Mod Hard finish--- Points: " + Points);
        while (res.equals("z")) {
            PerguntashardFilmes();
            break;
        }

    }

}
