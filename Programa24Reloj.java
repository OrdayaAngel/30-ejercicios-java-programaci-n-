import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class Programa24Reloj extends JFrame {

    public Programa24Reloj() {
        setTitle("Reloj digital");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel hora = new JLabel("", SwingConstants.CENTER);
        hora.setFont(new Font("Arial", Font.BOLD, 24));
        add(hora);

        new Timer(1000, e -> 
            hora.setText(LocalTime.now().withNano(0).toString())
        ).start();

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa24Reloj());
    }
}
