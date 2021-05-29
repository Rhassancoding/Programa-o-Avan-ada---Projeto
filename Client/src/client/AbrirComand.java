
package client;

public class AbrirComand implements Comand{
   public GameQuiz gamequiz;
    public AbrirComand(GameQuiz gameQuiz){this.gamequiz = gameQuiz;}
    
    public void Abrir() {
      gamequiz.iniciar();
    }

    public void Fechar() {
       gamequiz.finalizar();
    }
    
}
