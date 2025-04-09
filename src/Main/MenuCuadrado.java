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
        setLayout(null); // También posicionamiento absoluto acá
        
        JLabel lblLado = new JLabel("Lado:");
        lblLado.setBounds(50, 50, 100, 30);
        add(lblLado);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtLado = new JTextField();
        txtLado.setBounds(120, 50, 100, 30);
        add(txtLado);

        JLabel lblUnidad = new JLabel("cm");
        lblUnidad.setBounds(230, 50, 30, 30);
        add(lblUnidad);



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