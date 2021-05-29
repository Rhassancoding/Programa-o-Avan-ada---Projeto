
package client;


public class FecharComand implements Comand{
   public GameQuiz gamequiz;
  public FecharComand (GameQuiz gamequiz){this.gamequiz = this.gamequiz;}
  
    public void Abrir() {
       gamequiz.iniciar();
    }
    public void Fechar() {
       gamequiz.finalizar();
    }
    
    
    
    
    
    
}
