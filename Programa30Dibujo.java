import javax.swing.*;
import java.awt.*;

public class Programa30Dibujo extends JFrame {

    public Programa30Dibujo() {
        setTitle("Dibujo simple");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.BLUE);
                g.fillRect(50, 50, 100, 60);

                g.setColor(Color.RED);
                g.fillOval(200, 50, 100, 100);

                g.setColor(Color.BLACK);
                g.drawString("Figuras en Swing", 140, 200);
            }
        };

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa30Dibujo());
    }
}
