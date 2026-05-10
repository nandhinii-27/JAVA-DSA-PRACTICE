import javax.swing.*;
import java.awt.event.*;

class SimpleGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("My App");

        JButton b = new JButton("Click Me");
        b.setBounds(100, 100, 100, 40);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello!");
            }
        });

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}