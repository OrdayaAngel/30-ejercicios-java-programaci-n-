import javax.swing.*;
import java.awt.*;

public class Programa13Registro extends JFrame {

    public Programa13Registro() {
        setTitle("Registro");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        JTextField nombre = new JTextField();
        JTextField correo = new JTextField();
        JTextField edad = new JTextField();
        JButton btn = new JButton("Registrar");

        btn.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Nombre: " + nombre.getText()
                            + "\nCorreo: " + correo.getText()
                            + "\nEdad: " + edad.getText()
            );
        });

        add(new JLabel("Nombre:"));
        add(nombre);

        add(new JLabel("Correo:"));
        add(correo);

        add(new JLabel("Edad:"));
        add(edad);

        add(new JLabel(""));
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa13Registro());
    }
}
