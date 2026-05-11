import javax.swing.*;
import java.awt.*;

public class Programa29FechaSimple extends JFrame {

    public Programa29FechaSimple() {
        setTitle("Fecha simple");
        setSize(380, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JComboBox<Integer> dia = new JComboBox<>();
        JComboBox<String> mes = new JComboBox<>(new String[]{
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        });
        JComboBox<Integer> anio = new JComboBox<>();

        for (int i = 1; i <= 31; i++) dia.addItem(i);
        for (int i = 2020; i <= 2030; i++) anio.addItem(i);

        JButton btn = new JButton("Mostrar fecha");

        btn.addActionListener(e -> JOptionPane.showMessageDialog(
                this,
                dia.getSelectedItem() + " de " +
                mes.getSelectedItem() + " de " +
                anio.getSelectedItem()
        ));

        add(dia);
        add(mes);
        add(anio);
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa29FechaSimple());
    }
}
