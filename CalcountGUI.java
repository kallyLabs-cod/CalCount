import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import java.awt.color.*;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class CalcountGUI extends JFrame{
    public CalcountGUI() {
        setTitle("CalCount");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        setLocationRelativeTo(null);

        JLabel tlabel = new JLabel("<html>CalCount</html>", SwingConstants.CENTER);
        tlabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tlabel.setFont(new Font("Arial", Font.BOLD, 24));
        setLayout(new BorderLayout());
        add(tlabel, BorderLayout.NORTH);
        JLabel nLabel = new JLabel("<html>Name: </html>");
        add(nLabel, BorderLayout.WEST);
        nLabel.setBorder(BorderFactory.createMatteBorder(1,1,0,1, Color.BLACK));

    }
    
}
