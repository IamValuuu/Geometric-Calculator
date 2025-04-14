package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuRectangulo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;

    public MenuRectangulo(final Panel panelPadre) {
        setLayout(null);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 50, 100, 30);
        add(lblBase);

        final JTextField txtBase = new JTextField();
        txtBase.setBounds(120, 50, 100, 30);
        add(txtBase);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 100, 100, 30);
        add(lblAltura);

        final JTextField txtAltura = new JTextField();
        txtAltura.setBounds(120, 100, 100, 30);
        add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 150, 100, 30);
        add(btnCalcular);

        final JLabel lblResultado = new JLabel("<html>Perímetro:<br>Área:</html>");
        lblResultado.setBounds(300, 50, 300, 60);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float base = Float.parseFloat(txtBase.getText());
                    float altura = Float.parseFloat(txtAltura.getText());

                    float perimetro = 2 * (base + altura);
                    float area = base * altura;

                    lblResultado.setText("<html>" +
                            "Perímetro: " + perimetro + " cm<br>" +
                            "Área: " + area + " cm²" +
                            "</html>");
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Ingresá valores válidos");
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
