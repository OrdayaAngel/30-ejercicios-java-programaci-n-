import javax.swing.*;
import java.awt.*;

public class Programa09Moneda extends JFrame {

    public Programa09Moneda() {
        setTitle("Conversor de soles a dólares");
        setSize(380, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        JTextField soles = new JTextField();
        JLabel resultado = new JLabel("Dólares: ");
        JButton btn = new JButton("Convertir");

        btn.addActionListener(e -> {
            try {
                double montoSoles = Double.parseDouble(soles.getText());
                double tipoCambio = 3.70;
                double dolares = montoSoles / tipoCambio;

                resultado.setText("Dólares: " + dolares);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un dato válido");
            }
        });

        add(new JLabel("Soles:"));
        add(soles);

        add(btn);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa09Moneda());
    }
}
