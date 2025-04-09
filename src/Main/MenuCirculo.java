package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuCirculo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;
    
    public MenuCirculo(final Panel panelPadre) {
        setLayout(null); // También posicionamiento absoluto acá
        
        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(50, 50, 100, 30);
        add(lblRadio);
        
        // Cuadro de input para el ingreso del dato
        JTextField txtRadio = new JTextField();
        txtRadio.setBounds(120, 50, 100, 30);
        add(txtRadio);

        JLabel lblUnidadRadio = new JLabel("cm");
        lblUnidadRadio.setBounds(230, 50, 30, 30);
        add(lblUnidadRadio);

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