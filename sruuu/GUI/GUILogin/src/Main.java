import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel fail;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(100, 80, 80,25);
        button.addActionListener(new Main());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(115, 110, 300,25);
        panel.add(success);
        fail = new JLabel("");
        fail.setBounds(50, 110, 300,25);
        panel.add(fail);


        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("Sita") && password.equals("sruu123")) {
            success.setText("Loged in");
        } else {
            fail.setText("wrong password or username");
        }

    }
}