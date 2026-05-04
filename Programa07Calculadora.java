import javax.swing.*;
import java.awt.*;

public class Programa07Calculadora extends JFrame {

    public Programa07Calculadora() {
        setTitle("Calculadora básica");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();

        JComboBox<String> operaciones = new JComboBox<>(
                new String[]{"+", "-", "*", "/"}
        );

        JLabel resultado = new JLabel("Resultado: ");
        JButton btn = new JButton("Calcular");

        btn.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                String op = (String) operaciones.getSelectedItem();

                double res = 0;

                switch (op) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            JOptionPane.showMessageDialog(this, "No se puede dividir entre cero");
                            return;
                        }
                        res = a / b;
                        break;
                }

                resultado.setText("Resultado: " + res);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese valores válidos");
            }
        });

        add(new JLabel("Número 1:"));
        add(txt1);

        add(new JLabel("Número 2:"));
        add(txt2);

        add(new JLabel("Operación:"));
        add(operaciones);

        add(btn);
        add(resultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa07Calculadora());
    }
}
