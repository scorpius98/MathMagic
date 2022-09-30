
import java.awt.Color; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 

/**
 * Write a description of class JFrameMathMagic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFrameMathMagic
{
    // instance variables - replace the example below with your own
    JFrame myFrame;
    JPanel greenPanel;
    JPanel blackPanel;

    /**
     * Constructor for objects of class JFrameMathMagic
     */
    public JFrameMathMagic()
    {
        // initialise instance variables
        myFrame = new JFrame("bullshit");
        
        greenPanel = new JPanel();
        greenPanel.setLayout(null);
        greenPanel.setBounds(0, 0, 475, 355);
        greenPanel.setBackground(Color.green);
        
        blackPanel = new JPanel();
        blackPanel.setLayout(null);
        blackPanel.setBounds(0, 0,470, 350);
        blackPanel.setBackground(Color.black);
        
        myFrame.setLayout(null);
        myFrame.setSize(480,360);
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main (String [] args) {
    {
        // put your code here
        //rip
    }
}
}
