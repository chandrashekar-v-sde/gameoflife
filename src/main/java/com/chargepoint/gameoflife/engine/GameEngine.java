package com.chargepoint.gameoflife.engine;

import com.chargepoint.gameoflife.model.Universe;

public class GameEngine {

    private static final int[][] DIRECTIONS = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
    };

    private final RuleEvaluator ruleEvaluator;

    public GameEngine(RuleEvaluator ruleEvaluator) {
        this.ruleEvaluator = ruleEvaluator;
    }

    public Universe nextGeneration(Universe current) {
        Universe next = new Universe(current.getRows(), current.getCols());

        for (int row = 0; row < current.getRows(); row++) {
            for (int col = 0; col < current.getCols(); col++) {
                int liveNeighbours = countLiveNeighbours(current, row, col);
                boolean nextState = ruleEvaluator.getNextState(current.isAlive(row, col), liveNeighbours);
                next.setAlive(row, col, nextState);
            }
        }

        return next;
    }

    private int countLiveNeighbours(Universe universe, int row, int col) {
        int count = 0;

        for (int[] direction : DIRECTIONS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (isInsideUniverse(universe, newRow, newCol) && universe.isAlive(newRow, newCol)) {
                count++;
            }
        }

        return count;
    }

    private boolean isInsideUniverse(Universe universe, int row, int col) {
        return row >= 0
                && row < universe.getRows()
                && col >= 0
                && col < universe.getCols();
    }
}