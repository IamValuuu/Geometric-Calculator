package Main;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel extends JPanel {
    CardLayout cardLayout;
    
    final public int width = 1270;
    final public int height = 720;
    
    public Panel() {
        cardLayout = new CardLayout();
        this.setPreferredSize(new Dimension(width, height));
        setLayout(cardLayout);
        add(new MenuPrincipal(this), "menuPrincipal");
        add(new MenuCuadrado(this), "menuCuadrado");
        add(new MenuRectangulo(this), "menuRectangulo");
        add(new MenuCirculo(this), "menuCirculo");
        add(new MenuTriangulo(this), "menuTriangulo");
        add(new MenuParalelepipedo(this), "menuParalelepipedo");
        add(new MenuEsfera(this), "menuEsfera");
        add(new MenuCubo(this), "menuCubo");
        
        mostrarPanel("menuPrincipal");
    }

    public void mostrarPanel(String nombrePanel) {
        cardLayout.show(this, nombrePanel);
    }
}