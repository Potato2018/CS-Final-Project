import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPanel extends JPanel
{
   private static JButton play, highScore, quit;
   
   private static int cScore, hScore;
   public MenuPanel()
   {
      setLayout(new GridLayout(4,1));
      
      JLabel title = new JLabel("The Chase For an Extremely Important Older Woman");
      title.setFont(new Font("Comic Sans", Font.BOLD, 37));
      title.setForeground(Color.green.darker());
      add(title, SwingConstants.CENTER);
      
      play = new JButton ("PLAY");
      play.addActionListener(new Listener());
      add(play);
      
      highScore = new JButton ("HIGH SCORE");
      highScore.addActionListener(new Listener2());
      add(highScore);
      
      quit = new JButton ("QUIT");
      quit.addActionListener(new Listener3());
      add(quit);
   
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         }
      }
   
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
         
         }
      }
}
