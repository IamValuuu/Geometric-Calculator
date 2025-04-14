package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuCirculo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;

    public MenuCirculo(final Panel panelPadre) {
        setLayout(null);

        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(50, 50, 100, 30);
        add(lblRadio);

        final JTextField txtRadio = new JTextField();
        txtRadio.setBounds(120, 50, 100, 30);
        add(txtRadio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 100, 100, 30);
        add(btnCalcular);

        final JLabel lblResultado = new JLabel("<html>Circunferencia:<br>Área:</html>");
        lblResultado.setBounds(300, 50, 300, 60);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float radio = Float.parseFloat(txtRadio.getText());

                    float circunferencia = (float) (2 * Math.PI * radio);
                    float area = (float) (Math.PI * radio * radio);

                    lblResultado.setText("<html>" +
                            "Circunferencia: " + String.format("%.2f", circunferencia) + " cm<br>" +
                            "Área: " + String.format("%.2f", area) + " cm²" +
                            "</html>");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Ingresá un número válido");
                }
            }
        });

        JButton btnPrincipal = new JButton("Ir al menú principal");
        btnPrincipal.setBounds(panelPadre.width - tamanioBtnX - 10, panelPadre.height - tamanioBtnY - 10, tamanioBtnX, tamanioBtnY);

        btnPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuPrincipal");
            }
        });

        add(btnPrincipal);
    }
}
