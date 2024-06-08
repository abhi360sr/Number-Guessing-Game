# Number-Guessing-Game
The Number Guessing Game is a simple and interactive desktop application built using Java Swing. The game's objective is to guess a randomly generated number between 1 and 100 within a limited number of attempts. Here's a detailed description of the game's features and functionality:

Features
User Interface: The game features a graphical user interface (GUI) with intuitive controls for user interaction.

Prompt Label: A label prompting the user to enter their guess.
Input Field: A text field where the user can type their guess.
Message Label: A label that provides feedback on the user's guess (e.g., "Too Low!", "Too High!", or "Congratulations!").
Attempts Label: A label displaying the number of attempts remaining.
Guess Button: A button the user clicks to submit their guess.
Game Logic:

Random Number Generation: The game generates a random target number between 1 and 100 at the start.
Attempts Tracking: The user has a maximum of 10 attempts to guess the correct number.
Feedback Mechanism: After each guess, the game provides feedback indicating whether the guess was too low, too high, or correct.
End of Game: The game ends either when the user guesses the correct number or exhausts all attempts. Upon winning or losing, the guess button is disabled, and a final message is displayed.
How to Play
Starting the Game: Run the application to open the game window.
Making a Guess: Enter a number between 1 and 100 in the text field and click the "Guess" button.
Receiving Feedback: The game will provide feedback:
"Too Low!" if the guess is less than the target number.
"Too High!" if the guess is greater than the target number.
"Congratulations! You guessed the number!" if the guess is correct.
Attempts Management: The number of remaining attempts is displayed and updated after each guess.
Game Over: If the user runs out of attempts without guessing the correct number, the game reveals the target number and disables further guessing.
Implementation Details
Main Class (NumberGuessingGame): This class extends JFrame and sets up the game's GUI and logic.
Constructor: Initializes the GUI components and the game's logic, such as the target number and attempts.
makeGuess Method: Handles the user's guess, updates the feedback and attempts labels, and checks for win/lose conditions.
Main Method: Uses SwingUtilities.invokeLater to ensure the GUI is created on the Event Dispatch Thread, improving thread safety and performance.
The Number Guessing Game is an enjoyable and educational application that combines basic game design with Java Swing programming, offering users a fun way to practice their guessing skills and learn Java GUI development.

