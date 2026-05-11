import javax.swing.*;
import java.awt.*;

public class Programa19Tareas extends JFrame {

    public Programa19Tareas() {
        setTitle("Lista de tareas");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        DefaultListModel<String> modelo = new DefaultListModel<>();
        JList<String> lista = new JList<>(modelo);

        JTextField tarea = new JTextField();
        JButton agregar = new JButton("Agregar");
        JButton eliminar = new JButton("Eliminar");

        agregar.addActionListener(e -> {
            if (!tarea.getText().trim().isEmpty()) {
                modelo.addElement(tarea.getText());
                tarea.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese una tarea");
            }
        });

        eliminar.addActionListener(e -> {
            int indice = lista.getSelectedIndex();

            if (indice != -1) {
                modelo.remove(indice);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una tarea para eliminar");
            }
        });

        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.add(tarea, BorderLayout.CENTER);
        panelSuperior.add(agregar, BorderLayout.EAST);

        add(panelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(lista), BorderLayout.CENTER);
        add(eliminar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa19Tareas());
    }
}
