package Main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MenuPrincipal extends JPanel {
    
    public int tamanioBtnX = 250;
    public int tamanioBtnY = 50;
    
    public MenuPrincipal(final Panel panelPadre) {
        setLayout(null); // Habilita posicionamiento absoluto
        
        JLabel titulo = new JLabel("Elija una figura:", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setBounds(385, 10, 500, 100); // x, y, ancho, alto
        add(titulo);

        JButton btnCuadrado = new JButton("Cuadrado");
        btnCuadrado.setBounds(50, 100, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto
        JButton btnRectangulo = new JButton("Rectangulo");
        btnRectangulo.setBounds(100 + tamanioBtnX, 100, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto
        JButton btnCirculo = new JButton("Circulo");
        btnCirculo.setBounds(150 + tamanioBtnX*2, 100, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto
        JButton btnTriangulo = new JButton("Triangulo");
        btnTriangulo.setBounds(200 + tamanioBtnX*3, 100, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto
        JButton btnParalelepipedo = new JButton("Paralelepipedo");
        btnParalelepipedo.setBounds(50, 150 + tamanioBtnY, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto
        JButton btnEsfera = new JButton("Esfera");
        btnEsfera.setBounds(100 + tamanioBtnX, 150 + tamanioBtnY, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto
        JButton btnCubo = new JButton("Cubo");
        btnCubo.setBounds(150 + tamanioBtnX*2, 150 + tamanioBtnY, tamanioBtnX, tamanioBtnY); // x, y, ancho, alto
        
        btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuCuadrado");
            }
        });
        btnRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuRectangulo");
            }
        });
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuCirculo");
            }
        });
        btnTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuTriangulo");
            }
        });
        btnParalelepipedo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuParalelepipedo");
            }
        });
        btnEsfera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuEsfera");
           
            }
        });
        btnCubo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPadre.mostrarPanel("menuCubo");
            }
        });
        add(btnCuadrado);
        add(btnRectangulo);
        add(btnCirculo);
        add(btnTriangulo);
        add(btnParalelepipedo);
        add(btnEsfera);
        add(btnCubo);
    }
}