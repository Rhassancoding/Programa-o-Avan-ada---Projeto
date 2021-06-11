
package com.mycompany.gamequiz;

import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.DoubleStream.Builder;

public class PerguntasGames implements Builder{

    public void PerguntaFacil() {
         Scanner opcao = new Scanner(System.in);
       int Points=0;String res;
              System.out.println("\n----Theme is Games ---\n Mod:Easy\n Qual era o nome antigo do Mario?\n" +"a)Luigi\n" +"b)Shigeru\n" +"c)Sempre foi Mario\n" +"d)Jumpman");       
                 res = opcao.next();
                  while(!res.equals("d")){
                        Points=0;break;
                        
                  }while(res.equals("d")){
                     Points=1;break;
                  }  
           if(Points == 1 ){
               System.out.println("\n1-Qual era o nome antigo do Mario?\n" +"a)Luigi\n" +"b)Shigeru\n" +"c)Sempre foi Mario\n" +"d)Jumpman" );
                 res = opcao.next(); if(res == "d"){Points=Points+1; }else{System.out.println("\nEnd Game\tPoints :"+Points);}
            if(Points == 2){
             System.out.println("\n2-Qual foi o primeiro jogo de Lego lançado?\n" +"a)Star Wars\n" +"b)Batman\n" +"c)Indiana Jones"); 
                 res = opcao.next(); if(res.equals("a")){ Points=Points+3; }else{System.out.println("\nEnd Game\tPoints :"+Points);}
            
            if(Points ==3 ){System.out.println("\n3-Antes do lançamento de GTA V, rolou um baixo assinado pedindo para a Rockstar lançar GTA V para que plataforma além do Xbox 360 e PS3?\n" +"a)PC\n" +"b)Wii U\n" +"c)PS4 e Xbox One\n" +"d)3ds");
                   res = opcao.next(); if(res.equals("a")){ Points=Points+4;} }else{System.out.println("\nEnd Game\tPoints :"+Points);}
             
            if(Points ==4 ){System.out.println("\n4-Qual é a empresa do Megaman?\n" +"a)Nintendo\n" +"b)Activision\n" +"c)THQ\n" +"d)Capcom");
                   res = opcao.next(); if(res.equals("d")){ System.out.println("---Mod Easy finish--- Points: "+ Points);} }else{System.out.println("\nEnd Game\tPoints :"+Points);}
              
    
    
    

   

            

            }}}}
   
    


  
       
    
