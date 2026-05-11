import javax.swing.*;
import java.awt.*;

public class Programa23Progreso extends JFrame {

    public Programa23Progreso() {
        setTitle("Barra de progreso");
        setSize(350, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JProgressBar barra = new JProgressBar(0, 100);
        barra.setValue(0);
        barra.setStringPainted(true);

        JButton btn = new JButton("Iniciar");

        btn.addActionListener(e -> {
            new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    barra.setValue(i);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();
        });

        add(barra);
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa23Progreso());
    }
}
