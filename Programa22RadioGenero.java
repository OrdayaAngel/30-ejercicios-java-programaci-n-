import javax.swing.*;
import java.awt.*;

public class Programa22RadioGenero extends JFrame {

    public Programa22RadioGenero() {
        setTitle("RadioButton");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton femenino = new JRadioButton("Femenino");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(femenino);

        JButton btn = new JButton("Aceptar");

        btn.addActionListener(e -> {
            String genero;

            if (masculino.isSelected()) {
                genero = "Masculino";
            } else if (femenino.isSelected()) {
                genero = "Femenino";
            } else {
                genero = "No seleccionado";
            }

            JOptionPane.showMessageDialog(this, "Género: " + genero);
        });

        add(masculino);
        add(femenino);
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa22RadioGenero());
    }
}
