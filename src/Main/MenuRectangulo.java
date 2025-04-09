package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuRectangulo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;
    
    public MenuRectangulo(final Panel panelPadre) {
        setLayout(null); // También posicionamiento absoluto acá
        
        JLabel lblLadoA = new JLabel("Lado A:");
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