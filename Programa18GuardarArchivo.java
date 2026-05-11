import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

public class Programa18GuardarArchivo extends JFrame {

    public Programa18GuardarArchivo() {
        setTitle("Guardar archivo");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        JButton guardar = new JButton("Guardar como");

        guardar.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();

            if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                try (PrintWriter pw = new PrintWriter(fc.getSelectedFile())) {
                    pw.print(area.getText());
                    JOptionPane.showMessageDialog(this, "Guardado correctamente");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar");
                }
            }
        });

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(guardar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa18GuardarArchivo());
    }
}
