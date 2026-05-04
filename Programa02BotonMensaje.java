import javax.swing.*;

public class Programa02BotonMensaje extends JFrame {

    public Programa02BotonMensaje() {
        setTitle("Botón con mensaje");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton boton = new JButton("Haz clic");

        boton.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "Hola desde Swing")
        );

        add(boton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Programa02BotonMensaje());
    }
}
