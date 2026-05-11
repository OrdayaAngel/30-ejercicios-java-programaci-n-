import javax.swing.*;
import java.awt.*;

public class Programa28SelectorColor extends JFrame {

    public Programa28SelectorColor() {
        setTitle("Selector de color");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btn = new JButton("Elegir color");

        btn.addActionListener(e -> {
            Color color = JColorChooser.showDialog(
                    this, "Seleccione un color", Color.WHITE
            );

            if (color != null) {
                getContentPane().setBackground(color);
            }
        });

        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa28SelectorColor());
    }
}
