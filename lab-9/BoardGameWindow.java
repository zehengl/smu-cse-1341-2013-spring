import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardGameWindow extends JFrame {

  JButton newButton;
  JButton playButton;
  JTextArea output;
  JLabel nameLabel;
  JTextField nameField;
  JButton nameButton;
  BoardGame theGame;

  public BoardGameWindow() {
    super("My Board Game");
    setLayout(new FlowLayout());

    newButton = new JButton("New Game");
    add(newButton);
    newButton.addActionListener(new ButtonListener());

    nameLabel = new JLabel("Player Name:");
    nameField = new JTextField(20);
    nameButton = new JButton("Add Player");
    add(nameLabel);
    add(nameField);
    add(nameButton);
    nameButton.addActionListener(new ButtonListener());
    output = new JTextArea(20, 40);
    add(output);

    playButton = new JButton("Play");
    add(playButton);
    playButton.addActionListener(new ButtonListener());
    playButton.setEnabled(false);
    nameButton.setEnabled(false);
    nameField.setEnabled(false);

  }

  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == nameButton) {
        String s = theGame.addPlayer(nameField.getText());
        output.append("Added player: " + s + "\n");
        nameField.setText("");

      }
      if (e.getSource() == newButton) {
        theGame = new BoardGame();
        output.setText("NEW GAME!\n");
        playButton.setEnabled(true);
        nameButton.setEnabled(true);
        nameField.setEnabled(true);
        newButton.setEnabled(false);
      }
      if (e.getSource() == playButton) {
        String s = theGame.runSimulation();
        output.append(s);
        newButton.setEnabled(true);
        playButton.setEnabled(false);
        nameButton.setEnabled(false);
        nameField.setEnabled(false);

      }

    }
  }

}
