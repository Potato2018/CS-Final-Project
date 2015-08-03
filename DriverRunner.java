//StephanSeo
import javax.swing.JFrame; 
public class DriverRunner
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("IfRP");
      frame.setSize(1000,500);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new IngamePanel());
      frame.setVisible(true);
   }
}