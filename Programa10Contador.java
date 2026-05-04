import javax.swing.*;
import java.awt.*;

public class Programa10Contador extends JFrame {

    private int contador = 0;

    public Programa10Contador() {
        setTitle("Contador de clics");
        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lbl = new JLabel("Clics: 0", SwingConstants.CENTER);
        JButton btn = new JButton("Clic aquí");

        btn.addActionListener(e -> {
            contador++;
            lbl.setText("Clics: " + contador);
        });

        add(lbl, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa10Contador());
    }
}
