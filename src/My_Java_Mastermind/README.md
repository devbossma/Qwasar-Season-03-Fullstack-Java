# Welcome to My Java Mastermind
***

## Task
The challenge is to implement the classic Mastermind game in Java with clean, modular code organization.
The program must generate or accept a secret code of 4 distinct digits (0-8) and allow the player to guess it within a limited number of attempts (default 10).
After each guess, the game provides feedback indicating how many pieces are well placed (correct digit in correct position) and how many are misplaced (correct digit but wrong position).
The program must handle command-line options for specifying a custom code and number of attempts, and gracefully handle EOF (Ctrl+D).

## Description
The solution is structured into multiple classes, each with a single, well-defined responsibility.
This modular approach improves code organization, readability, and maintainability compared to a monolithic single-class design.

### Class Structure

The project separates different concerns into distinct classes:

#### Core Classes:

**1. CodeGenerator**
* **Responsibility:** Generates random secret codes with 4 distinct digits (0-8)
* **How it works:**
    - Creates a list of all possible digits (0-8)
    - Shuffles the list using `Collections.shuffle()`
    - Selects the first 4 digits to ensure uniqueness
    - Returns the code as a string
* **Why separate:** Complex logic for ensuring distinct digits deserves its own class

**2. InputValidator**
* **Responsibility:** Validates that user input meets Mastermind requirements
* **How it works:**
    - **Length check:** Verifies input is exactly 4 characters
    - **Character check:** Loops through each character and verifies it's between '0' and '8'
    - Prints "Wrong input!" for invalid entries
    - Returns true only if all checks pass
* **Why separate:** Keeps validation logic separate from game flow. Intentionally allows duplicate digits in guesses (e.g., "1111") because users don't know the secret code and may strategically guess duplicates

**3. Feedback**
* **Responsibility:** Represents the result of comparing a guess to the secret code
* **Properties:**
    - `wellPlaced`: Number of correct digits in correct positions
    - `misplaced`: Number of correct digits in wrong positions
* **Methods:**
    - `isWin()`: Returns true if all 4 pieces are well-placed
    - `display()`: Prints feedback or congratulations message
* **Why separate:** Encapsulates feedback data and display logic in one place

**4. FeedbackCalculator**
* **Responsibility:** Calculates how many pieces are well-placed and misplaced
* **How it works:**
    - Uses two tracking arrays:
        - `secretUsed[4]`: Marks which secret positions have been matched
        - `guessUsed[4]`: Marks which guess positions have been matched
    - **First pass - Well-placed pieces:**
        - Compares each position directly: `secret.charAt(i) == guess.charAt(i)`
        - If match found, increments well-placed counter and marks both positions as used
    - **Second pass - Misplaced pieces:**
        - Only checks guess positions that weren't well-placed
        - For each unmatched guess digit, searches secret for a match
        - Only considers secret positions that haven't been used
        - If match found, increments misplaced counter and marks secret position as used
    - Returns a `Feedback` object with the results
* **Why separate:** Core game logic with complex algorithm. The two-pass approach ensures each digit is counted only once, preventing double-counting bugs (e.g., secret "0123" vs guess "1111" correctly shows 1 well-placed, 0 misplaced)

**5. GameConfig**
* **Responsibility:** Holds game configuration data
* **Properties:**
    - `secretCode`: The code to be guessed
    - `maxAttempts`: Maximum number of rounds allowed
* **Why separate:** Separates configuration data from game logic

**6. CommandLineParser**
* **Responsibility:** Parses command-line arguments
* **How it works:**
    - Processes `-c` flag for custom code (truncates to 4 digits if longer)
    - Processes `-t` flag for custom attempt count (validates range 1-10)
    - Generates random code if no `-c` option provided
    - Uses default 10 attempts if no `-t` option provided
    - Returns a `GameConfig` object with parsed values
* **Why separate:** Centralizes argument parsing logic and keeps it out of main()

**7. MastermindGame**
* **Responsibility:** Orchestrates the game loop and coordinates all components
* **Dependencies:**
    - Uses `InputValidator` to validate guesses
    - Uses `FeedbackCalculator` to compute feedback
    - Uses `Scanner` to read user input
* **How it works:**
    - Displays welcome message
    - Manages the main game loop for all rounds
    - Handles input reading and EOF detection (Ctrl+D)
    - Tracks round progression (only increments on valid input)
    - Detects win condition and exits appropriately
    - Shows game over message if attempts exhausted
* **Why separate:** Coordinates all components and manages game flow without mixing in business logic

**8. my_mastermind (Main Class)**
* **Responsibility:** Application entry point
* **How it works:**
    - Creates `CommandLineParser` and parses command-line arguments
    - Gets `GameConfig` from parser
    - Creates `MastermindGame` with the configuration
    - Starts the game
* **Why separate:** Keeps main() minimal (only 5 lines) - just wires dependencies together

### Design Principles

#### Single Responsibility Principle
Each class has one clear job:
* `CodeGenerator` → generates codes
* `InputValidator` → validates input
* `FeedbackCalculator` → calculates feedback
* `MastermindGame` → runs game loop
* etc.

#### Benefits of Modular Design
* **Readability:** Easy to find where specific logic lives
* **Maintainability:** Changes are localized to specific classes
* **Testability:** Each class can be tested independently
* **Clarity:** Clear separation between data (GameConfig, Feedback) and behavior (validators, calculators, game engine)

#### Class Summary Table:

| Class | Responsibility | Key Methods | Lines of Code |
|-------|----------------|-------------|---------------|
| `CodeGenerator` | Random code generation | `generate()` | ~15 |
| `InputValidator` | Input validation | `isValid(String)` | ~15 |
| `Feedback` | Feedback data holder | `isWin()`, `display()` | ~20 |
| `FeedbackCalculator` | Feedback computation | `calculate(String, String)` | ~35 |
| `GameConfig` | Configuration storage | Getters | ~10 |
| `CommandLineParser` | CLI argument parsing | `parse(String[])` | ~30 |
| `MastermindGame` | Game orchestration | `start()`, `playGameLoop()` | ~45 |
| `my_mastermind` | Entry point | `main(String[])` | ~5 |

## Installation
**Clone the repository:**
```bash
git clone https://git.us.qwasar.io/my_java_mastermind_205863_ih8juk/my_java_mastermind.git
cd my_java_mastermind
```


## Usage
### 1. Compile the project:

```bash
javac my_mastermind.java
```

This will compile the main file and all dependent classes automatically.

### 2. Run the program with optional command-line arguments:

```bash
# Basic usage (random code):
java my_mastermind

# Specify a secret code:
java my_mastermind -c "0123"

# Specify number of attempts:
java my_mastermind -t 5

# Combine both options:
java my_mastermind -c "4567" -t 8
```

### 3. Game flow example:

```bash
java my_mastermind -c "0123"
Will you find the secret code?
---
Round 0
>1456
Well placed pieces: 0
Misplaced pieces: 1
---
Round 1
>tata
Wrong input!
>4132
Well placed pieces: 1
Misplaced pieces: 2
---
Round 2
>0123
Congrats! You did it!
```

### 4. Clean compiled files:

```bash
# Remove all .class files
rm *.class
```

### The Core Team


<span><i>Made at <a href='https://qwasar.io'>Qwasar SV -- Software Engineering School</a></i></span>
<span><img alt='Qwasar SV -- Software Engineering School's Logo' src='https://storage.googleapis.com/qwasar-public/qwasar-logo_50x50.png' width='20px' /></span>
