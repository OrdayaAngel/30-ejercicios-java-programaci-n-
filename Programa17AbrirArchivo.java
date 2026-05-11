import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Programa17AbrirArchivo extends JFrame {

    public Programa17AbrirArchivo() {
        setTitle("Abrir archivo");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        JButton abrir = new JButton("Abrir");

        abrir.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();

            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try (BufferedReader br = new BufferedReader(new FileReader(fc.getSelectedFile()))) {
                    area.read(br, null);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al abrir el archivo");
                }
            }
        });

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(abrir, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa17AbrirArchivo());
    }
}
