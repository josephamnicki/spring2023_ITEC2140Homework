# Group member's names: Akirah, Joseph, Kevin, Sanal

# SimpleSnakeGame

## Initialization and main method:
Before the constructor, methods are established for the initial conditions at the start of the game.
For example, a set size for the game grid is established as well as the initial size of the snake.
The main method runs the program and establishes the parameters for which the
game runs on (ex: GUI is created and remains until game is ended or closed).
## Class variables:
The class variable KeyEvent is used to detect keystrokes and determine which key is used for the direction of the snake.
SIZE, UNIT_SIZE, GAME_UNITS, and DELAY are also class variables since they remain static throughout the class.
## SimpleSnakeGame constructor:
The SimpleSnakeGame constructor sets the size and background for the game grid.

## startGame method:
The startGame method starts the game, creates a new apple on the grid, and begins the game's timer.
## newApple method:
The newApple method creates a new apple in the grid with random x and y coordinates on the game grid.
## paintComponent method:
The paintComponent method prompts the draw method to begin painting the colors of the snake and apple.
## draw method:
The draw method specifies the colors of the snake as it grows and apple
as well as displaying the "Game over" screen.
## move method:
The move method allows the snake to move in the direction
of the arrow key as well as directing the snake's body with its head.
## checkApple method:
The checkApple method tracks the number of apples eaten and checks if the 
apple was eaten by the snake, spawning a new apple if the last one is gone.
## checkCollisions method:
The checkCollisions method will stop the game if the snake touches any of the 
borders directly or on its own body.
## gameOver method:
The gameOver method prompts a graphic saying "Game Over" once the timer stops.
## actionPerformed method:
The actionPerformed method ensures the game continues to run by prompting
the snake to move as well as checking for the apple's location and no collisions.
## MyKeyAdapter class:
The MyKeyAdapter class is used in the move method and
determines the snake's movement direction. For example, if the 
snake is not moving left, it is moving right. These events are determined
by keystrokes with the arrow keys.