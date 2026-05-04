import javax.swing.*;
import java.awt.*;

public class Programa14Validacion extends JFrame {

    public Programa14Validacion() {
        setTitle("Validación");
        setSize(350, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        JTextField nombre = new JTextField();
        JButton btn = new JButton("Validar");

        btn.addActionListener(e -> {
            if (nombre.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío");
            } else {
                JOptionPane.showMessageDialog(this, "Campo correcto");
            }
        });

        add(new JLabel("Nombre:"));
        add(nombre);

        add(new JLabel(""));
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa14Validacion());
    }
}
