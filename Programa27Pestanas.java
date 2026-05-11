import javax.swing.*;

public class Programa27Pestanas extends JFrame {

    public Programa27Pestanas() {
        setTitle("Pestañas");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Inicio", new JLabel("Panel Inicio", SwingConstants.CENTER));
        tabs.addTab("Datos", new JLabel("Panel Datos", SwingConstants.CENTER));
        tabs.addTab("Ayuda", new JLabel("Panel Ayuda", SwingConstants.CENTER));

        add(tabs);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa27Pestanas());
    }
}
