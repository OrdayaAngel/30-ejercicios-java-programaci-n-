import javax.swing.*;

public class Programa26Tabla extends JFrame {

    public Programa26Tabla() {
        setTitle("Tabla de estudiantes");
        setSize(450, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] columnas = {"Código", "Nombre", "Nota"};
        String[][] datos = {
                {"001", "Ana", "18"},
                {"002", "Luis", "15"},
                {"003", "Rosa", "20"}
        };

        JTable tabla = new JTable(datos, columnas);
        add(new JScrollPane(tabla));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa26Tabla());
    }
}
