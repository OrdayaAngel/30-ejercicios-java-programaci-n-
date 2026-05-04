import javax.swing.*;
public class Programa01HolaMundo extends JFrame {

    public Programa01HolaMundo() {
        setTitle("Hola Mundo");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel etiqueta = new JLabel("Hola Mundo en Java Swing", SwingConstants.CENTER);
        add(etiqueta);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa01HolaMundo());
    }
}
