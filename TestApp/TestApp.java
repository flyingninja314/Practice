import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class TestApp extends JApplet {
  public void init() {
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          JLabel label = new JLabel("Hello, World!");
          add(label);
        }
      });
    } catch(Exception e) {
      System.err.println("createGUI didn't complete successfully");
    }
  }

  public static void main(String[] args) {

  }
}
