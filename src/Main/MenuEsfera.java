package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuEsfera extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;

    public MenuEsfera(final Panel panelPadre) {
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

        final JLabel lblResultado = new JLabel("<html>Área superficial:<br>Volumen:</html>");
        lblResultado.setBounds(300, 50, 300, 60);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float radio = Float.parseFloat(txtRadio.getText());

                    float areaSuperficial = (float) (4 * Math.PI * radio * radio);
                    float volumen = (float) ((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));

                    lblResultado.setText("<html>" +
                            "Área superficial: " + String.format("%.2f", areaSuperficial) + " cm²<br>" +
                            "Volumen: " + String.format("%.2f", volumen) + " cm³" +
                            "</html>");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Ingresá un valor válido");
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
