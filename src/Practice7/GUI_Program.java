package Practice7;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class GUI_Program extends JFrame {
    private Results results = new Results();
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonMadrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: "+results.getMilan()+" X "+results.getMadrid());
    JLabel scorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    GUI_Program() {
        super("Tournament");
        setLayout(null);
        setSize(300,175);
        buttonMilan.setBounds(10, 90, 125, 15);
        buttonMadrid.setBounds(150, 90, 125, 15);
        result.setBounds(106, 25, 125, 15);
        scorer.setBounds(98, 40, 150, 15);
        winner.setBounds(100, 55, 125, 15);
        buttonMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.addMilan();
                result.setText("Result: "+results.getMilan()+" X "+results.getMadrid());
                scorer.setText("Last Scorer: AC Milan");
                if (results.getMadrid() > results.getMilan()) {
                    winner.setText("Winner: Real Madrid");
                }
                else if (results.getMadrid() < results.getMilan()) {
                    winner.setText("Winner: AC Milan");
                }
                else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        buttonMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.addMadrid();
                result.setText("Result: "+results.getMilan()+" X "+results.getMadrid());
                scorer.setText("Last Scorer: Real Madrid");
                if (results.getMadrid() > results.getMilan()) {
                    winner.setText("Winner: Real Madrid");
                }
                else if (results.getMadrid() < results.getMilan()) {
                    winner.setText("Winner: AC Milan");
                }
                else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        setLocationRelativeTo(null);
        add(buttonMilan);
        add(buttonMadrid);
        add(result);
        add(scorer);
        add(winner);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI_Program();
    }
}