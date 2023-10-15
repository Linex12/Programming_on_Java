package Practice22.Task3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        ICreateDocument factory = new CreateTextDocument();
        JFrame jFrame = new JFrame("MenuBarProject");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newf = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem text = new JMenuItem("TextFile");
        JMenuItem image = new JMenuItem("ImageFile");
        JMenuItem music = new JMenuItem("MusicFile");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        mb.add(file);
        file.add(newf);
        newf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IDocument document = factory.CreateNew();
            }
        });
        file.add(open);
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IDocument document = factory.CreateOpen();
            }
        });
        file.add(save);
        file.add(exit);
        jFrame.setJMenuBar(mb);
        jFrame.setVisible(true);

    }
}
