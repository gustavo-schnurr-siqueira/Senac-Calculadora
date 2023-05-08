
package calculadoravisual;

import java.awt.Container;
import javax.swing.JFrame;


public class CalculadoraVisual extends JFrame {
    
    public CalculadoraVisual(){
            Container c = getContentPane();
            c.add(new TelaCalculadora());
            setSize(300,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    
    public static void main(String[] args) {
        
        new CalculadoraVisual();
        
    }
    
}
