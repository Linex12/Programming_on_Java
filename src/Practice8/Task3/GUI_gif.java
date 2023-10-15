package Practice8.Task3;

import javax.swing.*;

public class GUI_gif extends JFrame {
    GUI_gif(String filename) {
        super("Image");
        setSize(1200,500);
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        JLabel jl = new JLabel(icon);
        jl.setBounds(0,0,1200,500);
        setLocationRelativeTo(null);
        add(jl);
        setVisible(true);
    }
    public static void main(String[] args) {
        String filename = "troll-face-creepy-smile.gif";
        new GUI_gif(filename);
    }
}
