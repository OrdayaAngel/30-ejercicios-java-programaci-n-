import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

public class Programa16BlocNotas extends JFrame {

    public Programa16BlocNotas() {
        setTitle("Bloc de notas simple");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        JButton guardar = new JButton("Guardar");

        guardar.addActionListener(e -> {
            try (PrintWriter pw = new PrintWriter("nota.txt")) {
                pw.print(area.getText());
                JOptionPane.showMessageDialog(this, "Archivo guardado");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }
        });

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(guardar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa16BlocNotas());
    }
}
