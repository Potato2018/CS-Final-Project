import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


public class Scoreboard extends JPanel
{
   private static JLabel currentScore, highScore;
   private static int cScore, hScore;
   public Scoreboard()
   {
      cScore = 0;
      hScore = 0;
      setLayout(new GridLayout(2,2));
      add(new JLabel("Score:", SwingConstants.RIGHT));
      currentScore = new JLabel("" + cScore);
      currentScore.setHorizontalAlignment(SwingConstants.LEFT);
      add(currentScore);
      
      add(new JLabel("High Score:", SwingConstants.RIGHT));
      highScore = new JLabel("" + hScore);
      highScore.setHorizontalAlignment(SwingConstants.LEFT);
      add(highScore);
   }
      
   
   public static void update(int score)
   {
      cScore = score;
      hScore = Integer.parseInt(highScore.getText());
      currentScore.setText("" + cScore);
      if(score > hScore)
      {
         hScore = score;
      }
      currentScore.setText("" + cScore);
      highScore.setText("" + hScore);
   }
}
