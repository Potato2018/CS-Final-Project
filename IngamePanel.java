import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.JFrame;
import java.awt.geom.Area;

public class IngamePanel extends JPanel{
   private Scoreboard scoreboard = new Scoreboard();
   private BufferedImage myImage;
   private Graphics myBuffer;
   private static final int X = 1000;
   private static final int Y = 500;
   private Timer t; 
   private int score = 0;
   private Player player;
   private int numPlats;
   private ImageIcon background; 
   private Platform[] platform;
   
   public IngamePanel(){
      numPlats = 3;
      setLayout(new BorderLayout());
      
      myImage =  new BufferedImage(X, Y, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      background = new ImageIcon("game_background.jpg");
      myBuffer.drawImage(background.getImage(), 0, 0, X, Y, null);
   //       myBuffer.setColor(Color.red);
   //       myBuffer.fillRect(0, 0, X,Y);
      
      add(scoreboard, BorderLayout.NORTH);
      
      platform = new Platform[numPlats];
      for(int i = 0; i < numPlats; i ++){
         platform[i] = new Platform(0 + (i * 425), Y);
      }
      
      player = new Player(X, (int)(platform[0].getY() - 60) );
      
      t = new Timer(3, new Listener());
      t.start();
      addKeyListener(new Key());
      setFocusable(true);
   }
   public void paintComponent(Graphics g){
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         myBuffer.drawImage(background.getImage(), 0, 0, X, Y, null);
      //          myBuffer.setColor(Color.red);
      //          myBuffer.fillRect(0, 0, X,Y);
         scoreboard.update(score);
         
         player.draw(myBuffer);
         
         for(int a = 0; a < platform.length; a++){
            platform[a].movePlatform();
            platform[a].drawPlatform(myBuffer);
         }
         for(int a = 0; a < platform.length; a++){
            if(platform[a].getX() <= 0 - platform[a].getLength()){
               platform[a] = new Platform(X, Y);
            }
         }
         score ++;
         for(int a = 0; a < platform.length; a++){   
            if(player.getBounds().intersects(platform[a].getBounds())){
               player.setY((int)(platform[a].getY() - player.getHeight()));
            }
         }
         player.update();
         repaint();
      }
   }   
   private class Key extends KeyAdapter{
      public void keyPressed(KeyEvent e){
         if(e.getKeyCode() == KeyEvent.VK_UP)
            player.jump();
      }
   }
}

