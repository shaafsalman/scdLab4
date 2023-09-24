import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1_Frame extends JFrame {

    public Q1_Frame() {
        setTitle("Q1");
        setSize(500, 500);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Q1_Frame.this, "Hello, Swing!");
            }
        });

        add(button, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> new Q1_Frame());
    }
}
