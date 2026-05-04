import javax.swing.*;
import java.awt.*;

public class Programa12Login extends JFrame {

    public Programa12Login() {
        setTitle("Login simple");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        JTextField usuario = new JTextField();
        JPasswordField clave = new JPasswordField();
        JButton btn = new JButton("Ingresar");

        btn.addActionListener(e -> {
            String u = usuario.getText();
            String c = new String(clave.getPassword());

            if (u.equals("admin") && c.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Acceso correcto");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o clave incorrecta");
            }
        });

        add(new JLabel("Usuario:"));
        add(usuario);

        add(new JLabel("Clave:"));
        add(clave);

        add(new JLabel(""));
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa12Login());
    }
}
