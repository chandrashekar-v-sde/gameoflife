# Game of Life

Java 17 implementation of Conway's Game of Life.

## Description

The Game of Life is a cellular automaton where each cell is either alive or dead. The next generation is calculated based on the state of neighboring cells.

This implementation:

- Uses a 25x25 universe
- Initializes a Glider pattern in the center
- Applies Conway's Game of Life rules
- Prints each generation to the console
- Includes JUnit 5 unit tests

## Project Structure

- Universe - Maintains the state of the board
- RuleEvaluator - Applies Game of Life rules
- GameEngine - Generates the next generation
- GliderInitializer - Creates the initial Glider pattern
- UniversePrinter - Prints the board to the console
- Application - Entry point of the application

## Requirements

- Java 17
- Maven 3.x

## Build

```bash
mvn clean compile
```

## Run Tests

```bash
mvn test
```

## Run Application

```bash
mvn exec:java
```

Or run:

```text
com.chargepoint.gameoflife.Application
```

directly from your IDE.

## Sample Output

```text
Generation 0
. . . . .
. X . . .
. . X . .
X X X . .

Generation 1
...
```
