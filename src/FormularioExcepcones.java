import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioExcepcones {
    private JButton button1;
    private JPanel panel1;
    private JTextField numero1;
    private JTextField numero2;

    public FormularioExcepcones() {
        button1.addActionListener(new ActionListener() { //Calse anonima
            @Override
            public void actionPerformed(ActionEvent e) {
             //System.out.println("HOLA " + nombre.getText());
                JOptionPane.showMessageDialog(null, "Quiero Dividir " + numero1.getText() + "y " + numero2.getText());
            }
        });
    }

    public static void main(String[] args) {
        FormularioExcepcones formulario = new FormularioExcepcones();
        JFrame ventana = new JFrame();
        ventana.setContentPane(formulario.panel1); //le dice a la ventana cual es su panel
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }
}
