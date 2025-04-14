package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuTriangulo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;

    public MenuTriangulo(final Panel panelPadre) {
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

        JLabel lblLado1 = new JLabel("Lado 1:");
        lblLado1.setBounds(50, 150, 100, 30);
        add(lblLado1);

        final JTextField txtLado1 = new JTextField();
        txtLado1.setBounds(120, 150, 100, 30);
        add(txtLado1);

        JLabel lblLado2 = new JLabel("Lado 2:");
        lblLado2.setBounds(50, 200, 100, 30);
        add(lblLado2);

        final JTextField txtLado2 = new JTextField();
        txtLado2.setBounds(120, 200, 100, 30);
        add(txtLado2);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 250, 100, 30);
        add(btnCalcular);

        final JLabel lblResultado = new JLabel("<html>Perímetro:<br>Área:</html>");
        lblResultado.setBounds(300, 50, 300, 80);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float base = Float.parseFloat(txtBase.getText());
                    float altura = Float.parseFloat(txtAltura.getText());
                    float lado1 = Float.parseFloat(txtLado1.getText());
                    float lado2 = Float.parseFloat(txtLado2.getText());

                    float perimetro = base + lado1 + lado2;
                    float area = (base * altura) / 2;

                    lblResultado.setText("<html>" +
                            "Perímetro: " + perimetro + " cm<br>" +
                            "Área: " + area + " cm²" +
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