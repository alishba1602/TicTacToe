import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TicTacToe{
    int boardHeight = 650;
    int boardWidth = 600;
    JFrame frame = new JFrame();
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    public TicTacToe(){
        frame.setVisible(true);
        frame.setSize (boardHeight, boardWidth);
        frame.setResizable (false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout (new BorderLayout());

        textLabel.setBackground(Color.black);
        textLabel.setForeground(Color.pink);
        textLabel.setFont (new Font ("Arial",Font.BOLD,50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("TIC TAC TOE");
        textLabel.setOpaque(true);

        textPanel.setLayout (new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel);

    }
}