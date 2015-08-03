import java.awt.*;
import javax.swing.*;
import java.awt.Rectangle.*;

public class Platform{
   private double myX;
   private double myY;
   private double myLength;
   private double myHeight;
   private double myXVel;
   public Platform(int x, int y){
      myY = Math.random() * (y/10) + 350;
      myX = x;
      myLength = 280;
      myHeight = y - myY;
      myXVel = 0.1;
   }
   public double getX(){
      return myX;
   }
   public double getY(){
      return myY;
   }
   public double getLength(){
      return myLength;
   }
   public double getHeight(){
      return myHeight;
   }
   public void setX(double x){
      myX = x;
   }
   public void setY(double y){
      myY = y;
   }
   public Rectangle getBounds(){
      return new Rectangle((int)myX, (int)myY, (int)myLength, (int)myHeight);
   }
   public void drawPlatform(Graphics mybuffer){
      ImageIcon platform = new ImageIcon("platform.png");
      mybuffer.drawImage(platform.getImage(), (int)myX , (int)myY , (int)myLength, (int)myHeight, null);

   }
   public void movePlatform(){
      setX(getX() - 4);
   }
}
