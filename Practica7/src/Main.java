
import GUI.RobotsPanel;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Main {
    
    static JFrame frame = null;

    public static void main(String[] args) {
       
       frame = initFrame();
       frame.add(new RobotsPanel());
       frame.setTitle("Cocina robot");
       frame.setVisible(true);  
       frame.pack();
        
    }
    
    
    static JFrame initFrame(){
     
       frame = new JFrame();
       frame.setSize(923, 437);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setVisible(true);       
       
       return frame;
        
    }
    
}
