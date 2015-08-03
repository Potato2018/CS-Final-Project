import java.awt.*;
import javax.swing.*;
import java.awt.Rectangle.*;

public class Player{
   private double myX;
   private double myY;
   private double myLength;
   private double myHeight;
   private double myYVel;
   public Player(int width, int height){
      myX = (int)(width * 0.1);
      myY = height;
      myLength = 30;
      myHeight = 60;
      myYVel = -1;
   }
   public double getY(){
      return myY;
   }
   public double getX(){
      return myX;
   }
   public double getYVel(){
      return myYVel;
   }
   public double getHeight(){
      return myHeight;
   }
   public void setY(int x){
      myY = x;
   }
   public void setX(int x){
      myX = x;
   }
   public void setYVel(double x){
      myYVel = x;
   }
   public Rectangle getBounds(){
      return new Rectangle((int)myX, (int)myY, (int)myLength, (int)myHeight);
   }
   public void draw(Graphics mybuffer){
      ImageIcon player = new ImageIcon("player.png");
      mybuffer.drawImage(player.getImage(), (int)myX , (int)myY , (int)myLength, (int)myHeight, null);
   }
   public void jump(){
      if(myYVel >= 5){
         myYVel = myYVel;
      }
      else if(myYVel > 0){
         myYVel = myYVel;
      }
      else{
         myYVel = 6;
      }
   }
   public void update(){
      myYVel -= 0.2;
      myY -= myYVel;
      if(getY() >= 500 - myHeight){
         setY((int)(500 - myHeight));
      }
      if(myYVel < -10){
         myYVel = -10;
      }
   }
//    public boolean checkLost(){
//       if(getY() <= 0 + myHeight){
//          return true;
//       }
//       return false;
//    }
//    private boolean checkStop(Platform p){
//       if(p.getY() == myY + myHeight){
//          return true;
//       }
//       return false;
//    }
}