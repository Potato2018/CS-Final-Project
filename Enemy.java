import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
   
public  abstract class Enemy
{
   private int myX;
   private int myY;
   private int myXWidth;
   private int myYWidth;
   private ImageIcon image;
      
   public Enemy(int x, int y, int type)
   {
      myX = x;
      myY = y;
      switch(type)
      {
         case 1:
            myXWidth = 30;
            myYWidth = 30;
            image = new ImageIcon("regular.png");
            break;
         case 2:
            myXWidth = 30;
            myYWidth = 60;
            image = new ImageIcon("tall.png");
            break;
         case 3:
            myXWidth = 60;
            myYWidth = 30;
            image = new ImageIcon("fat.png");
            break;
         default:
            myXWidth = 30;
            myYWidth = 30;
            image = new ImageIcon("regular.png");
      
      }
   }
   public int getX() 
   { 
      return myX;
   }
   public int getY()      
   { 
      return myY;
   }
   public int getXWidth() 
   { 
      return myXWidth;
   }
   public int getYWidth() 
   { 
      return myYWidth;
   }
   public void setX(int x)
   {
      myX = x;
   } 
   public void setY(int y)
   {
      myY = y;
   } 
   public void setXWidth(int xWidth)
   {
      myXWidth = xWidth;
   }
   public void setYWidth(int yWidth)
   {
      myYWidth = yWidth;
   }       
   public void draw(Graphics myBuffer) 
   {               
      myBuffer.drawImage(image.getImage(), myX, myY, myXWidth, myYWidth, null);
   }
   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
   }	
}
