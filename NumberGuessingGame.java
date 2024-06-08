import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGame extends JFrame {
    private int targetNumber;
    private int attemptsLeft;
    private static final int MAX_ATTEMPTS = 10;

    private JTextField guessField;
    private JLabel messageLabel;
    private JLabel attemptsLabel;
    private JButton guessButton;

    public NumberGuessingGame() {
        
        setTitle("Number Guessing Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        JLabel promptLabel = new JLabel("Enter your guess (1-100):");
        promptLabel.setBounds(50, 20, 200, 30);
        add(promptLabel);

        guessField = new JTextField();
        guessField.setBounds(250, 20, 100, 30);
        add(guessField);

        messageLabel = new JLabel("");
        messageLabel.setBounds(50, 60, 300, 30);
        add(messageLabel);

        attemptsLabel = new JLabel("Attempts left: " + MAX_ATTEMPTS);
        attemptsLabel.setBounds(50, 100, 300, 30);
        add(attemptsLabel);

        guessButton = new JButton("Guess");
        guessButton.setBounds(150, 140, 100, 30);
        add(guessButton);

        
        targetNumber = new Random().nextInt(100) + 1;
        attemptsLeft = MAX_ATTEMPTS;

        // Add action listener for the guess button
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeGuess();
            }
        });
    }

    private void makeGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            if (guess < 1 || guess > 100) {
                messageLabel.setText("Invalid guess. Enter a number between 1 and 100.");
                return;
            }

            attemptsLeft--;
            attemptsLabel.setText("Attempts left: " + attemptsLeft);

            if (guess < targetNumber) {
                messageLabel.setText("Too Low!");
            } else if (guess > targetNumber) {
                messageLabel.setText("Too High!");
            } else {
                messageLabel.setText("Congratulations! You guessed the number!");
                guessButton.setEnabled(false);
                return;
            }

            if (attemptsLeft == 0) {
                messageLabel.setText("You've run out of attempts! The number was " + targetNumber);
                guessButton.setEnabled(false);
            }
        } catch (NumberFormatException e) {
            messageLabel.setText("Invalid input. Enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumberGuessingGame().setVisible(true);
            }
        });
    }
}
