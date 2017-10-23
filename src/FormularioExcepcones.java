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
                try {
                    //System.out.println("HOLA " + nombre.getText());
                    int num1 = Integer.parseInt(numero1.getText());
                    int num2 = Integer.parseInt(numero2.getText());
                    int res = num1 / num2;
                    JOptionPane.showMessageDialog(null, "La division entre " + num1 + "y " + num2 + "= " + res);
                }
                catch(ArithmeticException e1)
                {
                    JOptionPane.showMessageDialog(null,"No puedes dividir entre 0");
                }
                catch(NumberFormatException e2)
                {
                    JOptionPane.showMessageDialog(null, "No ingresaste un numero");
                }
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
