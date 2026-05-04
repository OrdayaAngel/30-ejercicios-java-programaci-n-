import javax.swing.*;
import java.awt.*;

public class Programa08Temperatura extends JFrame {

    public Programa08Temperatura() {
        setTitle("Conversor de temperatura");
        setSize(350, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        JTextField celsius = new JTextField();
        JLabel resultado = new JLabel("Fahrenheit: ");
        JButton btn = new JButton("Convertir");

        btn.addActionListener(e -> {
            try {
                double c = Double.parseDouble(celsius.getText());
                double f = c * 9 / 5 + 32;

                resultado.setText("Fahrenheit: " + f);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un dato válido");
            }
        });

        add(new JLabel("Celsius:"));
        add(celsius);

        add(btn);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa08Temperatura());
    }
}
