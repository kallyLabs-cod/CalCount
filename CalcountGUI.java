import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;

public class CalcountGUI extends JFrame{
    public CalcountGUI() {
        setTitle("CalCount");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("<html>CalCount</html>", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
    }
    
}
