package com.chargepoint.gameoflife.engine;

public class RuleEvaluator {

    public boolean getNextState(boolean alive, int liveNeighbours) {
        if (alive) {
            // Live cell survives only with 2 or 3 live neighbours
            return liveNeighbours == 2 || liveNeighbours == 3;
        }

        // Dead cell becomes alive only with exactly 3 live neighbours
        return liveNeighbours == 3;
    }
}