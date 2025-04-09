package Main;

import javax.swing.JFrame;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Panel panel = new Panel();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); // Primero agregamos el panel
        frame.pack();     // Después lo ajustamos al tamaño preferido
        frame.setLocationRelativeTo(null); // Luego lo centramos
        frame.setVisible(true); // Finalmente, lo mostramos
    }
}