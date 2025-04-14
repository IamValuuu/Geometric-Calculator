package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuParalelepipedo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;

    public MenuParalelepipedo(final Panel panelPadre) {
        setLayout(null);

        JLabel lblLargo = new JLabel("Largo:");
        lblLargo.setBounds(50, 50, 100, 30);
        add(lblLargo);

        final JTextField txtLargo = new JTextField();
        txtLargo.setBounds(120, 50, 100, 30);
        add(txtLargo);

        JLabel lblAncho = new JLabel("Ancho:");
        lblAncho.setBounds(50, 100, 100, 30);
        add(lblAncho);

        final JTextField txtAncho = new JTextField();
        txtAncho.setBounds(120, 100, 100, 30);
        add(txtAncho);

        JLabel lblAlto = new JLabel("Alto:");
        lblAlto.setBounds(50, 150, 100, 30);
        add(lblAlto);

        final JTextField txtAlto = new JTextField();
        txtAlto.setBounds(120, 150, 100, 30);
        add(txtAlto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 200, 100, 30);
        add(btnCalcular);

        final JLabel lblResultado = new JLabel("<html>Área superficial:<br>Volumen:</html>");
        lblResultado.setBounds(300, 50, 300, 60);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float largo = Float.parseFloat(txtLargo.getText());
                    float ancho = Float.parseFloat(txtAncho.getText());
                    float alto = Float.parseFloat(txtAlto.getText());

                    float areaSuperficial = 2 * (largo * ancho + largo * alto + ancho * alto);
                    float volumen = largo * ancho * alto;

                    lblResultado.setText("<html>" +
                            "Área superficial: " + String.format("%.2f", areaSuperficial) + " cm²<br>" +
                            "Volumen: " + String.format("%.2f", volumen) + " cm³" +
                            "</html>");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Ingresá todos los valores correctamente");
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
