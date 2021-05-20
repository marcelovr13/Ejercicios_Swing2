import javax.swing.*;

public class Ejercicio13 {
    private JPanel panel1;
    private JPanel pnl1;
    private JScrollPane scpImagen;
    private JLabel lblImagen;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio13");
        frame.setContentPane(new Ejercicio13().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(500, 500, 500, 500);
    }
}
