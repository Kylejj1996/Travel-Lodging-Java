
package kylejohnsonM6;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Button extends JButton{
    //Creating a Color object to set the color of the borders
        Color border = new Color(36,72,85);
    
    Button(String text){
        super(text);
        setFont(new Font("Arial", Font.BOLD, 14));
        setBackground(new Color(251, 233, 208));
        setForeground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(border,4));
        
    }
}
