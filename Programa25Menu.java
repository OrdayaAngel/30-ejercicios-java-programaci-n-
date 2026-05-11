import javax.swing.*;

public class Programa25Menu extends JFrame {

    public Programa25Menu() {
        setTitle("Menú principal");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar barra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem salir = new JMenuItem("Salir");

        salir.addActionListener(e -> System.exit(0));

        archivo.add(salir);
        barra.add(archivo);

        setJMenuBar(barra);

        add(new JLabel("Ventana con menú", SwingConstants.CENTER));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa25Menu());
    }
}
