import javax.swing.*;
import java.awt.*;

public class Programa03Suma extends JFrame {

    public Programa03Suma() {
        setTitle("Suma de dos números");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();
        JLabel resultado = new JLabel("Resultado: ");
        JButton btn = new JButton("Sumar");

        btn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txt1.getText());
                int b = Integer.parseInt(txt2.getText());

                resultado.setText("Resultado: " + (a + b));
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
        SwingUtilities.invokeLater(() -> new Programa03Suma());
    }
}
