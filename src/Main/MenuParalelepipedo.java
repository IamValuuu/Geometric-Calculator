package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuParalelepipedo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;
    
    public MenuParalelepipedo(final Panel panelPadre) {
        setLayout(null); // También posicionamiento absoluto acá
        
        JLabel lblLargo = new JLabel("Largo:");
        lblLargo.setBounds(50, 50, 100, 30);
        add(lblLargo);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtLargo = new JTextField();
        txtLargo.setBounds(120, 50, 100, 30);
        add(txtLargo);

        JLabel lblUnidadLargo = new JLabel("cm");
        lblUnidadLargo.setBounds(230, 50, 30, 30);
        add(lblUnidadLargo);
        
        JLabel lblAncho = new JLabel("Ancho:");
        lblAncho.setBounds(50, 100, 100, 30);
        add(lblAncho);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtAncho = new JTextField();
        txtAncho.setBounds(120, 100, 100, 30);
        add(txtAncho);
        
        JLabel lblUnidadAncho = new JLabel("cm");
        lblUnidadAncho.setBounds(230, 100, 30, 30);
        add(lblUnidadAncho);
        
        JLabel lblAlto = new JLabel("Alto:");
        lblAlto.setBounds(50, 150, 100, 30);
        add(lblAlto);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtAlto = new JTextField();
        txtAlto.setBounds(120, 150, 100, 30);
        add(txtAlto);

        JLabel lblUnidadAlto = new JLabel("cm");
        lblUnidadAlto.setBounds(230, 150, 30, 30);
        add(lblUnidadAlto);

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