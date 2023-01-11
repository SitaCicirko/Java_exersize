import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    public GUI(){
        frame = new JFrame();
        JButton button = new JButton("Click me!");
        label = new JLabel("Number of clicks: 0");
        button.addActionListener(this);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 50, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Numer of clicks: " + count);

    }
}
