package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuCuadrado extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;

    public MenuCuadrado(final Panel panelPadre) {
        setLayout(null);

        JLabel lblLado = new JLabel("Lado:");
        lblLado.setBounds(50, 50, 100, 30);
        add(lblLado);

        // Input para ingresar el lado
        final JTextField txtLado = new JTextField();
        txtLado.setBounds(120, 50, 100, 30);
        add(txtLado);

        JLabel lblUnidad = new JLabel("cm");
        lblUnidad.setBounds(230, 50, 30, 30);
        add(lblUnidad);

        // Botón para calcular
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 100, 100, 30);
        add(btnCalcular);

        // Etiquetas para mostrar los resultados
        final JLabel lblResultado = new JLabel("<html>Perímetro: <p style='margin-bottom:-60px;'></p>Área: </html>");
        lblResultado.setBounds(300, 50, 200, 60);
        add(lblResultado);

        // Acción del botón calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float lado = Float.parseFloat(txtLado.getText());

                    float perimetro = 4 * lado;
                    float area = lado * lado;

                    lblResultado.setText("<html>" +
                            "Perímetro: " + perimetro + " cm<p style='margin-bottom:-60px;'></p>" +
                            "Área: " + area + " cm²" +
                            "</html>");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Ingresá un número válido");
                }
            }
        });

        // Botón para volver al menú principal
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
