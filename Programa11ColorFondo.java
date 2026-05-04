import javax.swing.*;
import java.awt.*;

public class Programa11ColorFondo extends JFrame {

    public Programa11ColorFondo() {
        setTitle("Cambiar color");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn = new JButton("Cambiar a amarillo");

        btn.addActionListener(e -> 
            getContentPane().setBackground(Color.YELLOW)
        );

        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa11ColorFondo());
    }
}
