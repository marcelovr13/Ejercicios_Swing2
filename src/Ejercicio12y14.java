import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio12y14 {
    private JPanel panel1;
    private JTextField txtEdad;
    private JTextField txtPeso;
    private JTextField txtEstatura;
    private JLabel lblEdad;
    private JLabel lblPeso;
    private JLabel lblEstatura;
    private JButton btnCalcular;
    private JTextField txtResultado;
    private JLabel lblResultado;
    double calculoIMC;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio12");
        frame.setContentPane(new Ejercicio12y14().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio12y14() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            if(Double.parseDouble(txtEdad.getText()) >= 18 && Double.parseDouble(txtPeso.getText()) > 0 && Double.parseDouble(txtEstatura.getText()) >= 1.50){
             calculoIMC = Double.parseDouble(txtPeso.getText()) / (Double.parseDouble(txtEstatura.getText()) * Double.parseDouble(txtEstatura.getText()));
             if (calculoIMC < 18.5){
                 txtResultado.setText("Peso inferior al normal");
             }else if (calculoIMC >= 18.5 && calculoIMC <= 24.9 ){
                 txtResultado.setText("Peso normal");
             }else if (calculoIMC >= 25 && calculoIMC <= 29.9){
                 txtResultado.setText("Peso superior al normal");
             }else if (calculoIMC > 30){
                 txtResultado.setText("Obesidad");
             }
            }else{
                txtResultado.setText("Alguno de los componentes no cumple con los requisitos y no se puede ejecutar el cálculo.");
            }
            }
        });
        txtEdad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                calcularIMC();
            }
        });
        txtPeso.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                calcularIMC();
            }
        });
        txtEstatura.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                calcularIMC();
            }
        });
    }
    public void calcularIMC(){
        if(Double.parseDouble(txtEdad.getText()) >= 18 && Double.parseDouble(txtPeso.getText()) > 0 && Double.parseDouble(txtEstatura.getText()) >= 1.50){
            calculoIMC = Double.parseDouble(txtPeso.getText()) / (Double.parseDouble(txtEstatura.getText()) * Double.parseDouble(txtEstatura.getText()));
            if (calculoIMC < 18.5){
                txtResultado.setText("Peso inferior al normal");
            }else if (calculoIMC >= 18.5 && calculoIMC <= 24.9 ){
                txtResultado.setText("Peso normal");
            }else if (calculoIMC >= 25 && calculoIMC <= 29.9){
                txtResultado.setText("Peso superior al normal");
            }else if (calculoIMC > 30){
                txtResultado.setText("Obesidad");
            }
        }else{
            txtResultado.setText("Alguno de los componentes no cumple con los requisitos y no se puede ejecutar el cálculo.");
        }

    }
}
