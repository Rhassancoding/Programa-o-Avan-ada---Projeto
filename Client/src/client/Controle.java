
package client;


public class Controle {
    private Comand [] comands;
     private Comand ultimocomand;
     
     public Controle(Comand abrirComand,Comand fecharComand){
       comands[0] = abrirComand;
       comands[1] =fecharComand;
     }     
     public void abrirComand(){comands[0].Abrir();ultimocomand = comands[0];}
     public void fecharComand(){comands[1].Fechar();ultimocomand = comands[1];}
     
 }
