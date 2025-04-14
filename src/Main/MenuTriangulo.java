package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuTriangulo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;
    
    public MenuTriangulo(final Panel panelPadre) {
        setLayout(null); // También posicionamiento absoluto acá
        
        JLabel lblLadoA = new JLabel("Base A:");
        lblLadoA.setBounds(50, 50, 100, 30);
        add(lblLadoA);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtLadoA = new JTextField();
        txtLadoA.setBounds(120, 50, 100, 30);
        add(txtLadoA);

        JLabel lblUnidadA = new JLabel("cm");
        lblUnidadA.setBounds(230, 50, 30, 30);
        add(lblUnidadA);
        
        JLabel lblLadoB = new JLabel("Lado B:");
        lblLadoB.setBounds(50, 100, 100, 30);
        add(lblLadoB);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtLadoB = new JTextField();
        txtLadoB.setBounds(120, 100, 100, 30);
        add(txtLadoB);
        
        JLabel lblUnidadB = new JLabel("cm");
        lblUnidadB.setBounds(230, 100, 30, 30);
        add(lblUnidadB);
        
        JLabel lblLadoC = new JLabel("Lado C:");
        lblLadoC.setBounds(50, 150, 100, 30);
        add(lblLadoC);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtLadoC = new JTextField();
        txtLadoC.setBounds(120, 150, 100, 30);
        add(txtLadoC);

        JLabel lblUnidadC = new JLabel("cm");
        lblUnidadC.setBounds(230, 150, 30, 30);
        add(lblUnidadC);
        
        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(300, 50, 100, 30);
        add(lblAltura);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtAltura = new JTextField();
        txtAltura.setBounds(360, 50, 100, 30);
        add(txtAltura);
        
        JLabel lblUnidadAltura = new JLabel("cm");
        lblUnidadAltura.setBounds(470, 50, 30, 30);
        add(lblUnidadAltura);

        JButton btnPrincipal = new JButton("Ir al menú principal");
        btnPrincipal.setBounds(panelPadre.width - tamanioBtnX - 10, panelPadre.height - tamanioBtnY - 10, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto

        btnPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuPrincipal");
            }
        });

        add(btnPrincipal);
    }
}