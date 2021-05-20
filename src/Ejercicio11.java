import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio11 {
    private JButton btnSubePasajero;
    private JButton btnBajaPasajero;
    private JButton btnReinicio;
    private JLabel lblNumeroPasajeros;
    private JTextField txtNumeroPasajeros;
    private JPanel panel1;
    int numeroPasajeros = 0;

    public Ejercicio11() {
        btnSubePasajero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            numeroPasajeros++;
                if(numeroPasajeros > 20){
                    txtNumeroPasajeros.setText("Límite alcanzado. No pueden subir más pasajeros");
                    numeroPasajeros = 20;
                }else{
                    txtNumeroPasajeros.setText("" + numeroPasajeros);
                }



            }
        });
        btnBajaPasajero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            numeroPasajeros--;
            if (numeroPasajeros < 0){
                txtNumeroPasajeros.setText("No se puede bajar ningún pasajero.");
                numeroPasajeros = 0;
            }else{
                txtNumeroPasajeros.setText("" + numeroPasajeros);
            }
            }
        });
        btnReinicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            numeroPasajeros = 0;
            txtNumeroPasajeros.setText("" + numeroPasajeros);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio11");
        frame.setContentPane(new Ejercicio11().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
