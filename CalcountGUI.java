import javax.swing.*;
import java.awt.*;

public class CalcountGUI extends JFrame {
    public CalcountGUI() {
        super("CalCount");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("CalCount", SwingConstants.CENTER);
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 28));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JPanel form = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        form.add(nameLabel);
        form.add(nameField);

        JPanel content = new JPanel(new BorderLayout(10, 20));
        content.setBorder(BorderFactory.createEmptyBorder(24, 24, 24, 24));
        content.add(title, BorderLayout.NORTH);
        content.add(form, BorderLayout.CENTER);

        setContentPane(content);
        setSize(500, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalcountGUI frame = new CalcountGUI();
            frame.setVisible(true);
        });
    }
}
