import javax.swing.*;
import java.awt.*;

public class Programa21CheckHobbies extends JFrame {

    public Programa21CheckHobbies() {
        setTitle("Hobbies");
        setSize(350, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JCheckBox leer = new JCheckBox("Leer");
        JCheckBox deporte = new JCheckBox("Deporte");
        JCheckBox musica = new JCheckBox("Música");

        JButton btn = new JButton("Mostrar");

        btn.addActionListener(e -> {
            String resultado = "Hobbies: ";

            if (leer.isSelected()) resultado += "Leer ";
            if (deporte.isSelected()) resultado += "Deporte ";
            if (musica.isSelected()) resultado += "Música ";

            JOptionPane.showMessageDialog(this, resultado);
        });

        add(leer);
        add(deporte);
        add(musica);
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa21CheckHobbies());
    }
}
