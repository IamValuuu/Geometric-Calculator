package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuCubo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;

    public MenuCubo(final Panel panelPadre) {
        setLayout(null);

        JLabel lblLado = new JLabel("Lado:");
        lblLado.setBounds(50, 50, 100, 30);
        add(lblLado);

        final JTextField txtLado = new JTextField();
        txtLado.setBounds(120, 50, 100, 30);
        add(txtLado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 100, 100, 30);
        add(btnCalcular);

        final JLabel lblResultado = new JLabel("<html>Área total:<br>Volumen:</html>");
        lblResultado.setBounds(300, 50, 300, 60);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float lado = Float.parseFloat(txtLado.getText());

                    float areaTotal = 6 * lado * lado;
                    float volumen = lado * lado * lado;

                    lblResultado.setText("<html>" +
                            "Área total: " + areaTotal + " cm²<br>" +
                            "Volumen: " + volumen + " cm³" +
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
