import javax.swing.*;
import java.awt.*;

public class Programa06Division extends JFrame {

    public Programa06Division() {
        setTitle("División");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();
        JLabel resultado = new JLabel("Resultado: ");
        JButton btn = new JButton("Dividir");

        btn.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());

                if (b == 0) {
                    JOptionPane.showMessageDialog(this, "No se puede dividir entre cero");
                } else {
                    resultado.setText("Resultado: " + (a / b));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos");
            }
        });

        add(new JLabel("Número 1:"));
        add(txt1);

        add(new JLabel("Número 2:"));
        add(txt2);

        add(btn);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa06Division());
    }
}
