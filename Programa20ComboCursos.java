import javax.swing.*;
import java.awt.*;

public class Programa20ComboCursos extends JFrame {

    public Programa20ComboCursos() {
        setTitle("Cursos");
        setSize(350, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JComboBox<String> cursos = new JComboBox<>(
                new String[]{"Java", "Python", "C++", "HTML"}
        );

        JLabel lbl = new JLabel("Seleccione un curso");
        JButton btn = new JButton("Mostrar");

        btn.addActionListener(e -> 
            lbl.setText("Curso: " + cursos.getSelectedItem())
        );

        add(cursos);
        add(btn);
        add(lbl);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa20ComboCursos());
    }
}
