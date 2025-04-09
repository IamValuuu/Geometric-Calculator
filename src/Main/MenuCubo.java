package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuCubo extends JPanel {

    public int tamanioBtnX = 200;
    public int tamanioBtnY = 40;
    
    public MenuCubo (final Panel panelPadre) {
        setLayout(null); // También posicionamiento absoluto acá

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